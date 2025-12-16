package com.google.firebase.components;

import android.view.ViewGroup;
import com.adjust.sdk.Constants;
import com.google.android.gms.tasks.InterfaceC37020c;
import com.google.android.gms.tasks.Task;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.dynamiclinks.internal.FirebaseDynamicLinkRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import com.google.protobuf.CodedOutputStream;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.support.log.HMSLog;
import com.yandex.div.core.h0;
import com.yandex.div.core.m0;
import com.yandex.div.histogram.p;
import com.yandex.div.internal.parser.F;
import com.yandex.div.internal.widget.tabs.A;
import com.yandex.div.json.expressions.b;
import com.yandex.div2.C38231a;
import com.yandex.div2.C38261b;
import com.yandex.div2.C38271c;
import com.yandex.div2.C38281d;
import com.yandex.div2.C38291e;
import com.yandex.div2.C38301f;
import com.yandex.div2.C38374i;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;
import wZ0.InterfaceC49583a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class g implements h, InterfaceC49583a.InterfaceC12820a, com.google.android.datatransport.f, f, InterfaceC37020c, h0.a, m0, com.yandex.div.internal.widget.tabs.m, E21.a, com.yandex.div.histogram.p, com.yandex.div.internal.b, F {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f360744b;

    public /* synthetic */ g(int i12) {
        this.f360744b = i12;
    }

    public static int h(int i12, int i13, int i14, int i15) {
        return CodedOutputStream.D(i12) + i13 + i14 + i15;
    }

    public static com.yandex.div.json.expressions.b i(long j12, b.a aVar) {
        Long lValueOf = Long.valueOf(j12);
        aVar.getClass();
        return b.a.a(lValueOf);
    }

    public static void j(int i12, String str, String str2) {
        HMSLog.i(str2, str + i12);
    }

    @Override // com.google.firebase.components.f
    public Object a(c cVar) {
        switch (this.f360744b) {
            case 3:
                return FirebaseDynamicLinkRegistrar.lambda$getComponents$0(cVar);
            case 4:
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(cVar);
            default:
                return FirebaseMessagingRegistrar.lambda$getComponents$0(cVar);
        }
    }

    @Override // com.google.android.datatransport.f
    public Object apply(Object obj) {
        switch (this.f360744b) {
            case 2:
                com.google.firebase.crashlytics.internal.send.a.f361428b.getClass();
                return com.google.firebase.crashlytics.internal.model.serialization.b.f361385a.a((CrashlyticsReport) obj).getBytes(Charset.forName(Constants.ENCODING));
            default:
                EZ0.a aVar = (EZ0.a) obj;
                aVar.getClass();
                com.google.firebase.encoders.proto.f fVar = com.google.firebase.messaging.w.f361941a;
                fVar.getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    fVar.a(aVar, byteArrayOutputStream);
                } catch (IOException unused) {
                }
                return byteArrayOutputStream.toByteArray();
        }
    }

    @Override // com.yandex.div.histogram.p
    public boolean b() {
        switch (this.f360744b) {
            case 16:
                p.a aVar = p.a.f370031a;
                return true;
            default:
                p.a aVar2 = p.a.f370031a;
                return false;
        }
    }

    @Override // com.google.firebase.components.h
    public List c(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    @Override // com.yandex.div.core.h0.a
    public void e(boolean z12) {
        g gVar = h0.f367542d;
    }

    @Override // com.yandex.div.internal.widget.tabs.m
    public A.a f(ViewGroup viewGroup, com.yandex.div.internal.widget.tabs.c cVar, com.yandex.div.internal.widget.tabs.c cVar2) {
        switch (this.f360744b) {
            case 13:
                return new com.yandex.div.internal.widget.tabs.k(viewGroup, cVar, cVar2);
            default:
                return new com.yandex.div.internal.widget.tabs.n(viewGroup, cVar, cVar2);
        }
    }

    @Override // com.yandex.div.internal.parser.F
    public boolean g(Object obj) {
        switch (this.f360744b) {
            case 19:
                C38231a.b bVar = C38231a.f374126c;
                if (((String) obj).length() >= 1) {
                    break;
                }
                break;
            case 20:
                g gVar = C38261b.f374384c;
                if (((String) obj).length() >= 1) {
                    break;
                }
                break;
            case 21:
                g gVar2 = C38261b.f374384c;
                if (((String) obj).length() >= 1) {
                    break;
                }
                break;
            case 22:
                C38271c.b bVar2 = C38271c.f374682c;
                if (((String) obj).length() >= 1) {
                    break;
                }
                break;
            case 23:
                g gVar3 = C38281d.f374698c;
                if (((String) obj).length() >= 1) {
                    break;
                }
                break;
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                g gVar4 = C38281d.f374698c;
                if (((String) obj).length() >= 1) {
                    break;
                }
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                C38291e.b bVar3 = C38291e.f374720c;
                if (((String) obj).length() >= 1) {
                    break;
                }
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                g gVar5 = C38301f.f374744c;
                if (((String) obj).length() >= 1) {
                    break;
                }
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                g gVar6 = C38301f.f374744c;
                if (((String) obj).length() >= 1) {
                    break;
                }
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                long jLongValue = ((Long) obj).longValue();
                C38374i.b bVar4 = C38374i.f375287e;
                if (jLongValue >= 0) {
                    break;
                }
                break;
            default:
                long jLongValue2 = ((Long) obj).longValue();
                C38374i.b bVar5 = C38374i.f375287e;
                if (jLongValue2 >= 0) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // com.google.android.gms.tasks.InterfaceC37020c
    public Object then(Task task) {
        return 403;
    }

    @Override // wZ0.InterfaceC49583a.InterfaceC12820a
    public void d(wZ0.b bVar) {
    }
}
