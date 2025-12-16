package com.geetest.captcha;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001,B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\u0003J\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\bJ\u001f\u0010\f\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\nJ\u0015\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0012\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\nJ\u0015\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\bJ\u0015\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\bJ\u0015\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\bJ\u001f\u0010\u001a\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\nJ\u0015\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\bJ\u001f\u0010\u001b\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\nR\u0014\u0010\u001c\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0016\u0010 \u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001dR\u0014\u0010!\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u001dR\u0014\u0010\"\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\u001dR\u0016\u0010#\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010\u001dR\u0014\u0010&\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010\u001dR\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010*\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lcom/geetest/captcha/utils/LogUtils;", "", "<init>", "()V", "", "msg", "Lkotlin/G0;", "d", "(Ljava/lang/String;)V", "tag", "(Ljava/lang/String;Ljava/lang/String;)V", "destroy", "e", "i", "", "level", "init", "(ILjava/lang/String;)V", "log2sd", "data", "printLongString", "release", "", "enable", "setReleaseLog", "(Z)V", "v", "w", "DEBUG", "I", "ERROR", "INFO", "LEVEL", "NO_LOG", "PRINT_SIZE", "TAG", "Ljava/lang/String;", "VERBOSE", "WARN", "Lcom/geetest/captcha/utils/LogUtils$Logger;", "logger", "Lcom/geetest/captcha/utils/LogUtils$Logger;", "releaseLog", "Z", "Logger", "captcha_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes4.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static int f342729a = 4;

    /* renamed from: b, reason: collision with root package name */
    public static a f342730b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f342731c = true;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final h0 f342732d = new h0();

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001:\u0002\u001e\u001fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0003J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0003J!\u0010\u000b\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001d\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lcom/geetest/captcha/utils/LogUtils$Logger;", "", "<init>", "()V", "Lkotlin/G0;", "checkLogFile", "destroy", "init", "", "tag", "msg", "log", "(Ljava/lang/String;Ljava/lang/String;)V", "content", "write", "(Ljava/lang/String;)V", "Landroid/os/Handler;", "handler$delegate", "Lkotlin/C;", "getHandler", "()Landroid/os/Handler;", "handler", "Ljava/text/SimpleDateFormat;", "sdf", "Ljava/text/SimpleDateFormat;", "Landroid/os/HandlerThread;", "thread$delegate", "getThread", "()Landroid/os/HandlerThread;", "thread", "Companion", "Item", "captcha_release"}, k = 1, mv = {1, 4, 1})
    public static final class a {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public static final C10549a f342733d = new C10549a();

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC42726C f342734a = C42727D.c(d.INSTANCE);

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC42726C f342735b = C42727D.c(new c());

        /* renamed from: c, reason: collision with root package name */
        public final SimpleDateFormat f342736c = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA);

        /* renamed from: com.geetest.captcha.h0$a$a, reason: collision with other inner class name */
        public static final class C10549a {
            public static final /* synthetic */ boolean a(C10549a c10549a) {
                c10549a.getClass();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i0.f342741a);
                File file = new File(AK.c.s(sb2, File.separator, "Geetest"));
                if (file.exists()) {
                    File file2 = new File(file, "captcha_log.txt");
                    if (file2.exists() && file2.length() >= 10485760) {
                        return file2.delete();
                    }
                }
                return false;
            }

            public static final /* synthetic */ String b(C10549a c10549a) {
                c10549a.getClass();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i0.f342741a);
                return AK.c.s(sb2, File.separator, "Geetest");
            }
        }

        public static final class b {

            /* renamed from: a, reason: collision with root package name */
            public long f342737a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public String f342738b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.l
            public String f342739c;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "com/geetest/captcha/utils/LogUtils$Logger$handler$2$1", "invoke", "()Lcom/geetest/captcha/utils/LogUtils$Logger$handler$2$1;"}, k = 3, mv = {1, 4, 1})
        public static final class c extends N implements Y41.a<HandlerC10550a> {

            /* renamed from: com.geetest.captcha.h0$a$c$a, reason: collision with other inner class name */
            public static final class HandlerC10550a extends Handler {
                public HandlerC10550a(Looper looper) {
                    super(looper);
                }

                @Override // android.os.Handler
                public void handleMessage(@Y61.k Message message) throws Throwable {
                    super.handleMessage(message);
                    try {
                        if (Thread.interrupted()) {
                            return;
                        }
                        int i12 = message.what;
                        if (i12 != 0) {
                            if (i12 == 1) {
                                C10549a.a(a.f342733d);
                                return;
                            }
                            return;
                        }
                        Object obj = message.obj;
                        if (obj == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.geetest.captcha.utils.LogUtils.Logger.Item");
                        }
                        b bVar = (b) obj;
                        a aVar = a.this;
                        C10549a c10549a = a.f342733d;
                        SimpleDateFormat simpleDateFormat = aVar.f342736c;
                        long j12 = bVar.f342737a;
                        a.a(aVar, simpleDateFormat.format(new Date(j12)) + '\t' + bVar.f342738b + '\n' + bVar.f342739c + '\n');
                    } catch (Exception e12) {
                        e12.printStackTrace();
                    }
                }
            }

            public c() {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // Y41.a
            @Y61.k
            public final HandlerC10550a invoke() {
                return new HandlerC10550a(a.this.d().getLooper());
            }
        }

        public static final class d extends N implements Y41.a<HandlerThread> {
            public static final d INSTANCE = new d();

            public d() {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // Y41.a
            @Y61.k
            public final HandlerThread invoke() {
                return new HandlerThread("Captcha Thread");
            }
        }

        public final synchronized void b() {
            try {
                c().removeMessages(0);
                c().removeMessages(1);
                d().quitSafely();
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        }

        public final Handler c() {
            return (Handler) this.f342735b.getValue();
        }

        public final HandlerThread d() {
            return (HandlerThread) this.f342734a.getValue();
        }

        public final synchronized void e() {
            d().start();
        }

        public final synchronized void a(@Y61.l String str, @Y61.l String str2) {
            Message messageObtainMessage = c().obtainMessage();
            messageObtainMessage.what = 0;
            b bVar = new b();
            bVar.f342737a = System.currentTimeMillis();
            bVar.f342738b = str;
            bVar.f342739c = str2;
            messageObtainMessage.obj = bVar;
            c().sendMessage(messageObtainMessage);
        }

        public final synchronized void a() {
            Message messageObtainMessage = c().obtainMessage();
            messageObtainMessage.what = 1;
            c().sendMessage(messageObtainMessage);
        }

        public static final /* synthetic */ void a(a aVar, String str) throws Throwable {
            BufferedOutputStream bufferedOutputStream;
            Charset charsetForName;
            aVar.getClass();
            BufferedOutputStream bufferedOutputStream2 = null;
            try {
                try {
                    File file = new File(C10549a.b(f342733d));
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File(file, "captcha_log.txt"), true));
                    try {
                        charsetForName = Charset.forName("utf-8");
                    } catch (Exception unused) {
                        bufferedOutputStream2 = bufferedOutputStream;
                        if (bufferedOutputStream2 != null) {
                            bufferedOutputStream2.close();
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedOutputStream2 = bufferedOutputStream;
                        if (bufferedOutputStream2 != null) {
                            try {
                                bufferedOutputStream2.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                } catch (IOException unused3) {
                    return;
                }
            } catch (Exception unused4) {
            } catch (Throwable th3) {
                th = th3;
            }
            if (str != null) {
                bufferedOutputStream.write(str.getBytes(charsetForName));
                bufferedOutputStream.close();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
    }

    public final void a(@Y61.k String str) {
        if (f342729a <= 2) {
            c("Captcha", str);
        }
    }

    public final void b(@Y61.k String str) {
        if (f342729a <= 5) {
            c("Captcha", str);
        }
    }

    public final void c(@Y61.k String str) {
        c("Captcha", str);
    }

    public final void c(String str, String str2) {
        if (f342730b == null) {
            a aVar = new a();
            f342730b = aVar;
            aVar.e();
            a aVar2 = f342730b;
            if (aVar2 != null) {
                aVar2.a();
            }
        }
        a aVar3 = f342730b;
        if (aVar3 != null) {
            aVar3.a(str, str2);
        }
    }

    public final void a(@Y61.l String str, @Y61.k String str2) {
        if (f342729a <= 2) {
            c(str, str2);
        }
    }

    public final void b(@Y61.l String str, @Y61.k String str2) {
        if (f342729a <= 3) {
            c(str, str2);
        }
    }
}
