package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Path;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.media.MediaCodec;
import android.media.session.MediaController;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.RemoteException;
import android.util.Log;
import android.view.MotionEvent;
import com.google.android.material.datepicker.MaterialCalendar;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import one.me.chats.picker.AbstractPickerScreen;

/* loaded from: classes.dex */
public class i5i implements y1b, lyb, rn6, vy9, pm {
    public Object a;
    public Object b;

    public /* synthetic */ i5i(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public static t45[] d(t45 t45Var, t45 t45Var2, t45 t45Var3) {
        float f = t45Var.a;
        float f2 = t45Var2.a;
        float f3 = f - f2;
        float f4 = t45Var.b;
        float f5 = t45Var2.b;
        float f6 = f4 - f5;
        float f7 = t45Var3.a;
        float f8 = f2 - f7;
        float f9 = t45Var3.b;
        float f10 = f5 - f9;
        float f11 = (f + f2) / 2.0f;
        float f12 = (f4 + f5) / 2.0f;
        float f13 = (f2 + f7) / 2.0f;
        float f14 = (f9 + f5) / 2.0f;
        float fSqrt = (float) Math.sqrt((f6 * f6) + (f3 * f3));
        float fSqrt2 = (float) Math.sqrt((f10 * f10) + (f8 * f8));
        float f15 = f11 - f13;
        float f16 = f12 - f14;
        float f17 = fSqrt2 / (fSqrt + fSqrt2);
        if (Float.isNaN(f17)) {
            f17 = 0.0f;
        }
        float f18 = t45Var2.a - ((f15 * f17) + f13);
        float f19 = f5 - ((f16 * f17) + f14);
        return new t45[]{new t45(f11 + f18, f12 + f19), new t45(f13 + f18, f14 + f19)};
    }

    @Override // defpackage.rn6, defpackage.v2f
    public void a(Object obj) {
        ((ye5) this.b).k.n.remove((ae5) this.a);
    }

    public void b(pub pubVar) {
        ((ConcurrentHashMap) this.a).put(((jn8) this.b).e(pubVar), pubVar);
    }

    @Override // defpackage.pm
    public tl c(tl tlVar) {
        vk vkVar = (vk) ((kob) ((sl) this.b)).a(new uk((String) this.a), tlVar);
        return tlVar.b(vkVar.a, vkVar.b);
    }

    public int e(ArrayList arrayList, qee qeeVar, CameraCaptureSession.CaptureCallback captureCallback) {
        return ((CameraCaptureSession) this.a).captureBurst(arrayList, new py1(qeeVar, captureCallback), ((a12) this.b).a);
    }

    public void f() {
        this.a = null;
        this.b = null;
    }

    public u9 g() {
        return new u9((r45) this.a);
    }

    public gp5 h(Object... objArr) {
        Constructor constructorA;
        synchronized (((AtomicBoolean) this.b)) {
            if (!((AtomicBoolean) this.b).get()) {
                try {
                    constructorA = ((dm4) this.a).a();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.b).set(true);
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating extension", e);
                }
            }
            constructorA = null;
        }
        if (constructorA == null) {
            return null;
        }
        try {
            return (gp5) constructorA.newInstance(objArr);
        } catch (Exception e2) {
            throw new IllegalStateException("Unexpected error creating extractor", e2);
        }
    }

    public f3c i() {
        tx8 tx8Var = (tx8) this.a;
        db7 db7VarA = tx8Var.e.a();
        if (db7VarA != null) {
            try {
                return db7VarA.getPlaybackState();
            } catch (RemoteException | SecurityException e) {
                Log.e("MediaControllerCompat", "Dead object in getPlaybackState.", e);
            }
        }
        PlaybackState playbackState = tx8Var.a.getPlaybackState();
        if (playbackState != null) {
            return f3c.a(playbackState);
        }
        return null;
    }

    public wx8 j() {
        MediaController.TransportControls transportControls = ((tx8) this.a).a.getTransportControls();
        return Build.VERSION.SDK_INT >= 29 ? new xx8(10, transportControls) : new wx8(10, transportControls);
    }

    public Float k(e94 e94Var, e94 e94Var2) {
        bwf bwfVar = (bwf) this.b;
        float fFloatValue = ((Number) bwfVar.getValue()).floatValue();
        kac kacVar = e94Var2.b;
        float f = (kacVar.a + (kacVar.b + (kacVar.c + kacVar.d))) / fFloatValue;
        float fFloatValue2 = ((Number) bwfVar.getValue()).floatValue();
        kac kacVar2 = e94Var.b;
        float f2 = f - ((kacVar2.a + (kacVar2.b + (kacVar2.c + kacVar2.d))) / fFloatValue2);
        float fFloatValue3 = (e94Var2.a - (e94Var2.b.e / ((Number) bwfVar.getValue()).floatValue())) - (e94Var.a - (kacVar2.e / ((Number) bwfVar.getValue()).floatValue()));
        if (Float.isInfinite(fFloatValue3) || Float.isNaN(fFloatValue3) || fFloatValue3 == 0.0f) {
            return null;
        }
        float fLongValue = (f2 / fFloatValue3) / ((Number) ((bwf) ((zva) this.a).b).getValue()).longValue();
        if (0.0f > fLongValue || fLongValue > 1.0f) {
            return null;
        }
        return Float.valueOf(fLongValue);
    }

    @Override // defpackage.lyb
    public x26 l(long j) {
        Object next;
        Iterator it = ((fde) this.a).r().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((yyb) next).a == j) {
                break;
            }
        }
        yyb yybVar = (yyb) next;
        return yybVar == null ? fd5.a : gw0.x(new d53(gw0.x(new d53(((ay3) ((k18) this.b).getValue()).b(), 5), new h14(yybVar, j, null)), 12), new i14(j, null));
    }

    public void m(MotionEvent motionEvent) {
        r45 r45Var = (r45) this.a;
        ArrayList arrayList = (ArrayList) this.b;
        arrayList.add(new t45(motionEvent.getX(), motionEvent.getY()));
        if (arrayList.size() == 2) {
            float f = ((t45) arrayList.get(0)).a;
            float f2 = ((t45) arrayList.get(0)).b;
            float f3 = ((t45) arrayList.get(1)).a;
            float f4 = ((t45) arrayList.get(1)).b;
            r45Var.a.add(new s45(1, new float[]{f, f2, f3, f4}));
            Path path = r45Var.b;
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
        }
        if (arrayList.size() > 3) {
            t45[] t45VarArrD = d((t45) arrayList.get(0), (t45) arrayList.get(1), (t45) arrayList.get(2));
            t45[] t45VarArrD2 = d((t45) arrayList.get(1), (t45) arrayList.get(2), (t45) arrayList.get(3));
            float f5 = ((t45) arrayList.get(1)).a;
            float f6 = ((t45) arrayList.get(1)).b;
            t45 t45Var = t45VarArrD[1];
            float f7 = t45Var.a;
            float f8 = t45Var.b;
            t45 t45Var2 = t45VarArrD2[0];
            float f9 = t45Var2.a;
            float f10 = t45Var2.b;
            float f11 = ((t45) arrayList.get(2)).a;
            float f12 = ((t45) arrayList.get(2)).b;
            r45Var.a.add(new s45(2, new float[]{f5, f6, f7, f8, f9, f10, f11, f12}));
            Path path2 = r45Var.b;
            path2.moveTo(f5, f6);
            path2.cubicTo(f7, f8, f9, f10, f11, f12);
            arrayList.remove(0);
        }
    }

    public void n(long j) {
        jxb jxbVarI0 = ((AbstractPickerScreen) this.a).I0();
        tcf tcfVar = jxbVarI0.X;
        xs xsVar = new xs((Collection) tcfVar.getValue());
        xsVar.remove(Long.valueOf(j));
        jxbVarI0.c.d(j);
        tcfVar.m(null, xsVar);
    }

    public void o(Exception exc) {
        tu5 tu5Var = (tu5) this.a;
        rac racVarA = tu5Var.a();
        oac oacVar = tu5Var.b;
        racVarA.d(oacVar, "NetworkFetchProducer", exc, null);
        tu5Var.a().e(oacVar, "NetworkFetchProducer", false);
        ((mk0) oacVar).h("network", "default");
        tu5Var.a.e(exc);
    }

    @Override // defpackage.rn6
    public void onFailure(Throwable th) {
        bf5 bf5Var = ((ye5) this.b).k;
        bf5Var.n.remove((ae5) this.a);
        if (!(th instanceof MediaCodec.CodecException)) {
            bf5Var.b(0, th.getMessage(), th);
        } else {
            MediaCodec.CodecException codecException = (MediaCodec.CodecException) th;
            bf5Var.b(1, codecException.getMessage(), codecException);
        }
    }

    public void p(InputStream inputStream, int i) {
        of9 of9Var;
        ml6.i();
        px4 px4Var = (px4) this.b;
        tu5 tu5Var = (tu5) this.a;
        py0 py0Var = (py0) px4Var.b;
        dr6 dr6Var = (dr6) px4Var.c;
        if (i > 0) {
            py0Var.getClass();
            of9Var = new of9((mf9) py0Var.b, i);
        } else {
            py0Var.getClass();
            of9Var = new of9((mf9) py0Var.b);
        }
        byte[] bArr = (byte[]) dr6Var.get(16384);
        while (true) {
            try {
                int i2 = inputStream.read(bArr);
                if (i2 < 0) {
                    ((vui) px4Var.d).h(tu5Var);
                    px4Var.d(of9Var, tu5Var);
                    dr6Var.b(bArr);
                    of9Var.close();
                    ml6.i();
                    return;
                }
                if (i2 > 0) {
                    of9Var.write(bArr, 0, i2);
                    px4Var.e(of9Var, tu5Var);
                    tu5Var.a.i(i > 0 ? of9Var.c / i : 1.0f - ((float) Math.exp((-r5) / 50000.0d)));
                }
            } catch (Throwable th) {
                dr6Var.b(bArr);
                of9Var.close();
                throw th;
            }
        }
    }

    public int q(CaptureRequest captureRequest, qee qeeVar, CameraCaptureSession.CaptureCallback captureCallback) {
        return ((CameraCaptureSession) this.a).setRepeatingRequest(captureRequest, new py1(qeeVar, captureCallback), ((a12) this.b).a);
    }

    public ty r() throws IOException {
        File file = (File) this.b;
        File file2 = (File) this.a;
        if (file2.exists()) {
            if (file.exists()) {
                file2.delete();
            } else if (!file2.renameTo(file)) {
                a8i.l("AtomicFile", "Couldn't rename file " + file2 + " to backup file " + file);
            }
        }
        try {
            return new ty(file2, 1);
        } catch (FileNotFoundException e) {
            File parentFile = file2.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                throw new IOException("Couldn't create " + file2, e);
            }
            try {
                return new ty(file2, 1);
            } catch (FileNotFoundException e2) {
                throw new IOException("Couldn't create " + file2, e2);
            }
        }
    }

    public /* synthetic */ i5i(Object obj, Object obj2, boolean z) {
        this.a = obj2;
        this.b = obj;
    }

    public i5i(zva zvaVar) {
        this.a = zvaVar;
        this.b = new bwf(new m2(18, this));
    }

    public i5i(cm6 cm6Var) {
        this.a = cm6Var;
        this.b = ipi.b(3, new i6(15, this));
    }

    public i5i(String str, int i) {
        switch (i) {
            case 18:
                this.b = null;
                this.a = str;
                break;
            default:
                this.a = str;
                this.b = new bwf(new e44(8, this));
                break;
        }
    }

    public i5i(frf frfVar) {
        this.a = frfVar;
    }

    public i5i(CameraCaptureSession cameraCaptureSession, a12 a12Var) {
        cameraCaptureSession.getClass();
        this.a = cameraCaptureSession;
        this.b = a12Var;
    }

    public i5i(jn8 jn8Var) {
        this.a = new ConcurrentHashMap();
        this.b = jn8Var;
    }

    public i5i(Context context) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(wsi.g(context, MaterialCalendar.class.getCanonicalName(), dvc.materialCalendarStyle).data, z5d.MaterialCalendar);
        kk4.f(context, typedArrayObtainStyledAttributes.getResourceId(z5d.MaterialCalendar_dayStyle, 0));
        kk4.f(context, typedArrayObtainStyledAttributes.getResourceId(z5d.MaterialCalendar_dayInvalidStyle, 0));
        kk4.f(context, typedArrayObtainStyledAttributes.getResourceId(z5d.MaterialCalendar_daySelectedStyle, 0));
        kk4.f(context, typedArrayObtainStyledAttributes.getResourceId(z5d.MaterialCalendar_dayTodayStyle, 0));
        ColorStateList colorStateListC = gti.c(context, typedArrayObtainStyledAttributes, z5d.MaterialCalendar_rangeFillColor);
        this.a = kk4.f(context, typedArrayObtainStyledAttributes.getResourceId(z5d.MaterialCalendar_yearStyle, 0));
        kk4.f(context, typedArrayObtainStyledAttributes.getResourceId(z5d.MaterialCalendar_yearSelectedStyle, 0));
        this.b = kk4.f(context, typedArrayObtainStyledAttributes.getResourceId(z5d.MaterialCalendar_yearTodayStyle, 0));
        new Paint().setColor(colorStateListC.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }

    public i5i(int i) {
        switch (i) {
            case 22:
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                this.a = config;
                this.b = config;
                break;
        }
    }

    public i5i(Context context, g79 g79Var) {
        this.b = Collections.synchronizedSet(new HashSet());
        if (Build.VERSION.SDK_INT >= 29) {
            this.a = new ux8(context, g79Var);
        } else {
            this.a = new tx8(context, g79Var);
        }
    }

    public i5i(dm4 dm4Var) {
        this.a = dm4Var;
        this.b = new AtomicBoolean(false);
    }
}
