package ru.ok.android.sdk.util;

import android.text.TextUtils;
import android.util.Pair;
import com.adjust.sdk.Constants;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: OkRequestUtil.java */
/* loaded from: classes9.dex */
public class c {

    /* compiled from: OkRequestUtil.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f436719a = new ArrayList();

        public a(TreeMap treeMap) {
            for (Map.Entry entry : treeMap.entrySet()) {
                this.f436719a.add(new Pair(entry.getKey(), entry.getValue()));
            }
        }
    }

    public static String a(TreeMap treeMap) throws IOException {
        int i12;
        if (!treeMap.containsKey("method") || !treeMap.containsKey("application_key")) {
            return null;
        }
        a aVar = new a(treeMap);
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://api.ok.ru/fb.do").openConnection();
        httpURLConnection.setReadTimeout(3000);
        httpURLConnection.setConnectTimeout(JosStatusCodes.RTN_CODE_COMMON_ERROR);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty("Connection", "Keep-Alive");
        ArrayList arrayList = aVar.f436719a;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            Object obj = pair.first;
            if (obj != null && pair.second != null) {
                arrayList2.add(URLEncoder.encode((String) obj, Constants.ENCODING) + ContainerUtils.KEY_VALUE_DELIMITER + URLEncoder.encode((String) pair.second, Constants.ENCODING));
            }
        }
        String strJoin = TextUtils.join(ContainerUtils.FIELD_DELIMITER, arrayList2);
        if (strJoin.length() > 0) {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, Constants.ENCODING));
            bufferedWriter.write(strJoin);
            bufferedWriter.flush();
            bufferedWriter.close();
            outputStream.close();
        }
        InputStream inputStream = httpURLConnection.getInputStream();
        StringBuilder sb2 = new StringBuilder(Math.max(httpURLConnection.getContentLength(), 128));
        char[] cArr = new char[4096];
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, Constants.ENCODING);
        do {
            try {
                i12 = inputStreamReader.read(cArr, 0, 4096);
                if (i12 > 0) {
                    sb2.append(cArr, 0, i12);
                }
            } finally {
                try {
                    inputStreamReader.close();
                } catch (Exception unused) {
                }
            }
        } while (i12 >= 0);
        return sb2.toString();
    }
}
