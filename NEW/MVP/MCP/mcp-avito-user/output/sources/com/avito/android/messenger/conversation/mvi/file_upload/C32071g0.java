package com.avito.android.messenger.conversation.mvi.file_upload;

import com.avito.android.C34429s0;
import com.avito.android.messenger.conversation.mvi.data.InterfaceC32024m;
import com.avito.android.messenger.conversation.mvi.file_upload.AbstractC32094s0;
import com.avito.android.messenger.conversation.mvi.video.chunked_upload.InterfaceC32303b;
import com.avito.android.persistence.messenger.Q1;
import com.avito.android.persistence.messenger.UserEntityType;
import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.internal.operators.completable.C41811b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import ru.avito.messenger.InterfaceC47842z;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: MessengerVideoUploadCanceller.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/file_upload/g0;", "Lcom/avito/android/messenger/conversation/mvi/file_upload/f0;", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.conversation.mvi.file_upload.g0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32071g0 implements InterfaceC32069f0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32024m f191165a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.conversation.mvi.file_attachment.n f191166b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47842z f191167c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32303b f191168d;

    /* compiled from: MessengerVideoUploadCanceller.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/file_upload/g0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.file_upload.g0$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public C32071g0(@Y61.k InterfaceC32024m interfaceC32024m, @Y61.k com.avito.android.messenger.conversation.mvi.file_attachment.n nVar, @Y61.k InterfaceC47842z interfaceC47842z, @Y61.k InterfaceC32303b interfaceC32303b) {
        this.f191165a = interfaceC32024m;
        this.f191166b = nVar;
        this.f191167c = interfaceC47842z;
        this.f191168d = interfaceC32303b;
    }

    @Override // com.avito.android.messenger.conversation.mvi.file_upload.InterfaceC32069f0
    @Y61.k
    public final AbstractC41768a a(@Y61.k AbstractC32094s0.b bVar) {
        return this.f191168d.b(bVar);
    }

    @Override // com.avito.android.messenger.conversation.mvi.file_upload.InterfaceC32069f0
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.completable.K b(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k String str, @Y61.k String str2, @Y61.l Q1 q12, boolean z12) {
        String str3;
        String str4;
        InterfaceC32024m interfaceC32024m = this.f191165a;
        C41811b c41811bG = interfaceC32024m.f(str, str2, messengerUserHashInfo).o(new C32075i0(str2, messengerUserHashInfo, str, this)).g(interfaceC32024m.G(str, str2, messengerUserHashInfo));
        if (q12 != null && z12) {
            AbstractC41768a abstractC41768aA = com.avito.android.messenger.conversation.mvi.file_attachment.y.a(this.f191166b, q12.f215286e, "MessengerVideoUploadCanceller");
            String str5 = q12.f215282a;
            String str6 = q12.f215302u;
            UserEntityType userEntityType = q12.f215301t;
            AbstractC41768a abstractC41768aG = abstractC41768aA.g(this.f191165a.A(com.avito.android.messenger.util.i.d(str5, str6, userEntityType), q12.f215283b, q12.f215284c, null, null, null));
            String str7 = q12.f215290i;
            if (str7 != null && (str3 = q12.f215289h) != null && (str4 = q12.f215292k) != null) {
                abstractC41768aG = abstractC41768aG.g(interfaceC32024m.i0(q12.f215283b, q12.f215284c, com.avito.android.messenger.util.i.d(str5, str6, userEntityType))).k(new C34429s0(this, str7, str3, str4, 2));
            }
            c41811bG = c41811bG.g(abstractC41768aG);
        }
        return c41811bG.l(new C32073h0(messengerUserHashInfo, str, str2, q12));
    }
}
