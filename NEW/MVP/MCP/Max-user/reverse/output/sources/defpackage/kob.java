package defpackage;

import android.content.Context;
import android.media.MediaRecorder;
import android.net.Uri;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.cookie.SM;
import org.apache.http.protocol.HTTP;
import org.webrtc.CameraVideoCapturer;
import org.webrtc.CapturerObserver;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.YuvConverter;
import ru.ok.android.api.core.ApiException;
import ru.ok.android.api.core.ApiRequestException;
import ru.ok.android.api.core.ApiResponseException;
import ru.ok.android.api.http.HttpStatusApiException;
import ru.ok.android.api.json.JsonParseException;
import ru.ok.android.api.json.JsonSyntaxException;

/* loaded from: classes2.dex */
public final class kob implements CameraVideoCapturer, sl {
    public Object X;
    public final Object a;
    public final Object b;
    public volatile Object c;
    public final Object d;
    public Object o;

    public kob(CameraVideoCapturer cameraVideoCapturer, g32 g32Var, y6d y6dVar) {
        this.a = cameraVideoCapturer;
        this.b = g32Var;
        this.d = y6dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Object a(yl ylVar, tl tlVar) throws IOException, ApiException {
        u97 u97Var;
        int length;
        boolean zEqualsIgnoreCase;
        rha rhaVar = (rha) this.d;
        try {
            ((jm) this.X).debugApiRequest(this, ylVar, tlVar);
            gge ggeVarB = b(ylVar, tlVar);
            ba7 ba7VarH = ((h97) this.a).h(ggeVarB);
            try {
                int i = ba7VarH.b;
                zs zsVar = (zs) ba7VarH.c;
                if (i != 200) {
                    throw new HttpStatusApiException(i);
                }
                try {
                    yx7 yx7VarC = yx7.c(new BufferedInputStream(((HttpURLConnection) ((pk6) ba7VarH.d).b).getInputStream()));
                    if (zsVar.a(SM.SET_COOKIE)) {
                        lcj lcjVar = (lcj) this.o;
                        y64.a(zsVar);
                        lcjVar.getClass();
                    }
                    if (zsVar.a("Invocation-Error") || zsVar.a("WMF-Invocation-Error")) {
                        try {
                            throw ((Throwable) ylVar.getFailParser().parse(((jm) this.X).debugApiResponseFail(this, ylVar, yx7VarC)));
                        } catch (JsonParseException e) {
                            throw new ApiResponseException(e);
                        }
                    }
                    int i2 = 0;
                    try {
                        try {
                            Object obj = ylVar.getOkParser().parse(((jm) this.X).debugApiResponseOk(this, ylVar, yx7VarC));
                            while (true) {
                                if (i2 >= length) {
                                    break;
                                }
                                if (zEqualsIgnoreCase) {
                                    break;
                                }
                            }
                            ba7VarH.close();
                            return obj;
                        } catch (JsonParseException e2) {
                            throw new ApiResponseException(e2);
                        } catch (JsonSyntaxException e3) {
                            throw new ApiResponseException(e3);
                        }
                    } finally {
                        u97[] u97VarArr = (u97[]) ((zs) ggeVarB.d).b;
                        int length2 = u97VarArr.length;
                        while (true) {
                            if (i2 >= length2) {
                                u97Var = null;
                                break;
                            }
                            u97Var = u97VarArr[i2];
                            if (u97Var.a.equalsIgnoreCase("Geo-Position")) {
                                break;
                            }
                            i2++;
                        }
                        if ((u97Var != null ? u97Var.b : null) != null) {
                            rhaVar.getClass();
                        }
                    }
                } catch (JsonSyntaxException e4) {
                    throw new ApiResponseException(e4);
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    r4j.a(ba7VarH, th);
                    throw th2;
                }
            }
        } catch (IOException e5) {
            ((jm) this.X).debugIoException(this, ylVar, e5);
            throw e5;
        } catch (ApiException e6) {
            ((jm) this.X).debugApiException(this, ylVar, e6);
            throw e6;
        }
    }

    @Override // org.webrtc.CameraVideoCapturer
    public void addMediaRecorderToCamera(MediaRecorder mediaRecorder, CameraVideoCapturer.MediaRecorderHandler mediaRecorderHandler) {
        ((y6d) this.d).log("PatchedVideoCapturer", "addMediaRecorderToCamera");
    }

    public gge b(yl ylVar, tl tlVar) throws IOException, ApiRequestException {
        String string;
        pea peaVar;
        String str;
        ArrayList arrayList = new ArrayList();
        ylVar.getPriority();
        int i = 2;
        if (ylVar.shouldPost()) {
            string = ((rl) this.b).b(ylVar).toString();
            arrayList.add(new u97(HTTP.CONTENT_TYPE, URLEncodedUtils.CONTENT_TYPE));
            if (ylVar.shouldGzip()) {
                arrayList.add(new u97(HTTP.CONTENT_ENCODING, "gzip"));
            }
            if (!string.equals("https") && !dnf.r(string, "https:", false)) {
                i = 1;
            }
            peaVar = new pea();
            peaVar.b = this;
            peaVar.c = ylVar;
            peaVar.d = tlVar;
            peaVar.a = i;
            str = HttpPost.METHOD_NAME;
        } else {
            rl rlVar = (rl) this.b;
            String string2 = rlVar.b(ylVar).toString();
            int i2 = 3;
            if (g97.$EnumSwitchMapping$0[az1.v(3)] == 1) {
                if (!string2.equals("https") && !dnf.r(string2, "https:", false)) {
                    i = 1;
                }
                i2 = i;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            rlVar.g(byteArrayOutputStream, ylVar, tlVar, i2);
            if (byteArrayOutputStream.size() == 0) {
                string = string2;
            } else {
                StringBuilder sbO = ho7.o(string2, vmf.C(string2, '?', 0, 6) < 0 ? "?" : "&");
                sbO.append(byteArrayOutputStream.toString("UTF-8"));
                string = sbO.toString();
            }
            peaVar = null;
            str = HttpGet.METHOD_NAME;
        }
        String str2 = str;
        String str3 = string;
        pea peaVar2 = peaVar;
        if (ylVar instanceof cm0) {
        } else {
            Uri uri = ylVar.getUri();
            if (fni.a(uri.getScheme(), "ok") && fni.a(uri.getAuthority(), "api")) {
                wm.b(uri);
            } else {
                uri.getPath();
            }
        }
        String str4 = (String) this.c;
        if (str4 != null) {
            arrayList.add(new u97(HTTP.USER_AGENT, str4));
        }
        if (fni.a(ylVar.getUri().getAuthority(), "api")) {
            ((rha) this.d).getClass();
            ((lcj) this.o).getClass();
        }
        arrayList.add(new u97("Accept", "application/json"));
        if (str3 != null) {
            return new gge(str2, str3, new zs(1, (u97[]) arrayList.toArray(new u97[0])), peaVar2, 6);
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // org.webrtc.VideoCapturer
    public void changeCaptureFormat(int i, int i2, int i3) {
        ((CameraVideoCapturer) this.a).changeCaptureFormat(i, i2, i3);
    }

    @Override // org.webrtc.VideoCapturer
    public void dispose() {
        ((CameraVideoCapturer) this.a).dispose();
    }

    @Override // org.webrtc.VideoCapturer
    public void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver) {
        y6d y6dVar = (y6d) this.d;
        y6dVar.log("PatchedVideoCapturer", "initialize");
        if (((SurfaceTextureHelper) this.X) != null) {
            throw new IllegalStateException("Repeated initialization");
        }
        this.X = surfaceTextureHelper;
        int i = 1;
        try {
            Field declaredField = SurfaceTextureHelper.class.getDeclaredField("yuvConverter");
            declaredField.setAccessible(true);
            this.o = (YuvConverter) declaredField.get(surfaceTextureHelper);
        } catch (IllegalAccessException e) {
            y6dVar.logException("PatchedVideoCapturer", "Cant get yuv converter", e);
        } catch (NoSuchFieldException e2) {
            y6dVar.logException("PatchedVideoCapturer", "Cant get yuv converter", e2);
        }
        ((CameraVideoCapturer) this.a).initialize(surfaceTextureHelper, context, new vhb(this, i, capturerObserver));
    }

    @Override // org.webrtc.VideoCapturer
    public boolean isScreencast() {
        ((y6d) this.d).log("PatchedVideoCapturer", "isScreencast");
        return ((CameraVideoCapturer) this.a).isScreencast();
    }

    @Override // org.webrtc.CameraVideoCapturer
    public void removeMediaRecorderFromCamera(CameraVideoCapturer.MediaRecorderHandler mediaRecorderHandler) {
        ((y6d) this.d).log("PatchedVideoCapturer", "removeMediaRecorderFromCamera");
    }

    @Override // org.webrtc.VideoCapturer
    public void startCapture(int i, int i2, int i3) {
        ((y6d) this.d).log("PatchedVideoCapturer", "startCapture");
        ((CameraVideoCapturer) this.a).startCapture(i, i2, i3);
    }

    @Override // org.webrtc.VideoCapturer
    public void stopCapture() throws InterruptedException {
        ((y6d) this.d).log("PatchedVideoCapturer", "stopCapture");
        ((CameraVideoCapturer) this.a).stopCapture();
    }

    @Override // org.webrtc.CameraVideoCapturer
    public void switchCamera(CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler) {
        ((y6d) this.d).log("PatchedVideoCapturer", "switchCamera");
        ((CameraVideoCapturer) this.a).switchCamera(cameraSwitchHandler);
    }

    @Override // org.webrtc.CameraVideoCapturer
    public void switchCamera(CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler, String str) {
        ((y6d) this.d).log("PatchedVideoCapturer", "switchCamera");
        ((CameraVideoCapturer) this.a).switchCamera(cameraSwitchHandler, str);
    }

    public kob(h97 h97Var) {
        this.a = h97Var;
        this.b = new rl(4);
        this.d = rha.x0;
        this.o = y64.a;
        this.X = jm.a;
    }
}
