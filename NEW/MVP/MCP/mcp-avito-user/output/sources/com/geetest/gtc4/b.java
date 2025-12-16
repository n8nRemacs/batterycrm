package com.geetest.gtc4;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.avito.android.checkable_image.d;
import com.geetest.gtc4.GeeGuard;
import com.geetest.gtc4.GeeGuardConfiguration;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class b {
    public static GeeGuardReceipt a(Context context, String str, String str2) {
        if (str == null) {
            return null;
        }
        String data = Core.getData(context.getApplicationContext(), new GeeGuardConfiguration.Builder().setAppId(str).addSignature(str2).build());
        String string = context.getSharedPreferences("gt_core", 0).getString("gt_gid3", null);
        GeeGuardReceipt geeGuardReceipt = new GeeGuardReceipt();
        geeGuardReceipt.geeToken = data;
        geeGuardReceipt.geeID = string;
        geeGuardReceipt.appID = str;
        if (string != null && string.length() > 0) {
            String[] strArrSplit = string.split("-");
            if (strArrSplit.length == 4) {
                geeGuardReceipt.geeIDTimestamp = strArrSplit[1];
            }
        }
        return geeGuardReceipt;
    }

    public static void a(String str, GeeGuardReceipt geeGuardReceipt, int i12, GeeGuard.CallbackHandler callbackHandler) throws IOException {
        Pair pair;
        HashMap map = new HashMap();
        map.put("API-Version", "1");
        map.put("AppID", str);
        map.put("GeeID", geeGuardReceipt.geeID);
        map.put("Client-Type", "1");
        String str2 = geeGuardReceipt.geeToken;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://riskct.geetest.com/g2/api/v1/client_report").openConnection();
            httpURLConnection.setConnectTimeout(i12 > 0 ? i12 : 5000);
            if (i12 <= 0) {
                i12 = 3000;
            }
            httpURLConnection.setReadTimeout(i12);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setUseCaches(false);
            if (map.size() > 0) {
                for (Map.Entry entry : map.entrySet()) {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
            }
            if (!TextUtils.isEmpty(str2)) {
                OutputStream outputStream = httpURLConnection.getOutputStream();
                outputStream.write(str2.getBytes(StandardCharsets.UTF_8));
                outputStream.flush();
                outputStream.close();
            }
            int responseCode = httpURLConnection.getResponseCode();
            Pair<Boolean, String> pairA = a(httpURLConnection.getInputStream());
            if (((Boolean) pairA.first).booleanValue()) {
                pair = new Pair(Integer.valueOf(responseCode), (String) pairA.second);
            } else {
                pair = new Pair(Integer.valueOf(-responseCode), (String) pairA.second);
            }
        } catch (MalformedURLException e12) {
            a.a(String.valueOf(-11), e12);
            pair = new Pair(-11, e12.toString());
        } catch (ProtocolException e13) {
            a.a(String.valueOf(-12), e13);
            pair = new Pair(-12, e13.toString());
        } catch (IOException e14) {
            a.a(String.valueOf(-13), e14);
            pair = new Pair(-13, e14.toString());
        } catch (Exception e15) {
            a.a(String.valueOf(-14), e15);
            pair = new Pair(-14, e15.toString());
        }
        if (((Integer) pair.first).intValue() != 200) {
            if (callbackHandler != null) {
                callbackHandler.onCompletion(-300, geeGuardReceipt);
                return;
            }
            return;
        }
        geeGuardReceipt.originalResponse = (String) pair.second;
        try {
            JSONObject jSONObject = new JSONObject((String) pair.second);
            if (jSONObject.getInt("code") == 0) {
                geeGuardReceipt.respondedGeeToken = jSONObject.getJSONObject("data").getString("gee_token");
                if (callbackHandler != null) {
                    callbackHandler.onCompletion(200, geeGuardReceipt);
                }
            } else if (callbackHandler != null) {
                callbackHandler.onCompletion(-501, geeGuardReceipt);
            }
        } catch (JSONException e16) {
            a.a(String.valueOf(-15), e16);
            if (callbackHandler != null) {
                callbackHandler.onCompletion(-500, geeGuardReceipt);
            }
        }
    }

    public static void a(Context context, String str, String str2, int i12, GeeGuard.CallbackHandler callbackHandler) {
        if (str == null) {
            a.a("Empty App ID", new IllegalArgumentException("Empty App ID"));
            if (callbackHandler != null) {
                callbackHandler.onCompletion(-200, null);
                return;
            }
            return;
        }
        GeeGuardReceipt geeGuardReceiptA = a(context, str, str2);
        if (geeGuardReceiptA != null) {
            new Thread(new d(i12, str, 3, geeGuardReceiptA, callbackHandler)).start();
        } else if (callbackHandler != null) {
            callbackHandler.onCompletion(-200, null);
        }
    }

    public static Pair<Boolean, String> a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int i12 = inputStream.read(bArr);
                    if (i12 == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i12);
                }
                Pair<Boolean, String> pair = new Pair<>(Boolean.TRUE, byteArrayOutputStream.toString());
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e12) {
                    a.a(String.valueOf(-13), e12);
                }
                try {
                    inputStream.close();
                } catch (IOException e13) {
                    a.a(String.valueOf(-13), e13);
                }
                return pair;
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e14) {
                    a.a(String.valueOf(-13), e14);
                }
                if (inputStream != null) {
                    try {
                        inputStream.close();
                        throw th2;
                    } catch (IOException e15) {
                        a.a(String.valueOf(-13), e15);
                        throw th2;
                    }
                }
                throw th2;
            }
        } catch (IOException e16) {
            a.a(String.valueOf(-13), e16);
            Pair<Boolean, String> pair2 = new Pair<>(Boolean.FALSE, e16.toString());
            try {
                byteArrayOutputStream.close();
            } catch (IOException e17) {
                a.a(String.valueOf(-13), e17);
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e18) {
                    a.a(String.valueOf(-13), e18);
                }
            }
            return pair2;
        } catch (Exception e19) {
            a.a(String.valueOf(-14), e19);
            Pair<Boolean, String> pair3 = new Pair<>(Boolean.FALSE, e19.toString());
            try {
                byteArrayOutputStream.close();
            } catch (IOException e22) {
                a.a(String.valueOf(-13), e22);
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e23) {
                    a.a(String.valueOf(-13), e23);
                }
            }
            return pair3;
        }
    }
}
