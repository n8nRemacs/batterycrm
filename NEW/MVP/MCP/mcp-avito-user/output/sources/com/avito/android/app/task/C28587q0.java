package com.avito.android.app.task;

import com.avito.android.C30277e1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.conversation.mvi.file_upload.InterfaceC32069f0;
import com.avito.android.messenger.conversation.mvi.file_upload.InterfaceC32079k0;
import com.avito.android.messenger.conversation.mvi.file_upload.InterfaceC32095t;
import com.avito.android.messenger.conversation.mvi.file_upload.InterfaceC32098u0;
import com.avito.android.messenger.conversation.mvi.send.InterfaceC32200a;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Inject;
import kotlin.Metadata;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: LocalMessageSender.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/app/task/q0;", "Lcom/avito/android/app/task/T;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.app.task.q0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28587q0 implements T {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47842z f91691a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ru.avito.messenger.A f91692b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32095t f91693c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32098u0 f91694d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.service.a f91695e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.photo_cache.b f91696f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32200a f91697g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.B f91698h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.conversation.mvi.sync.G f91699i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f91700j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.conversation.mvi.file_upload.T f91701k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32079k0 f91702l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32069f0 f91703m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.conversation.mvi.data.f0 f91704n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final C30277e1 f91705o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.channels.mvi.sync.z0 f91706p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f91707q;

    @Inject
    public C28587q0(@Y61.k InterfaceC47842z interfaceC47842z, @Y61.k ru.avito.messenger.A a12, @Y61.k InterfaceC32095t interfaceC32095t, @Y61.k InterfaceC32098u0 interfaceC32098u0, @Y61.k com.avito.android.messenger.service.a aVar, @Y61.k com.avito.android.photo_cache.b bVar, @Y61.k InterfaceC32200a interfaceC32200a, @Y61.k com.avito.android.messenger.B b12, @Y61.k com.avito.android.messenger.conversation.mvi.sync.G g12, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.messenger.conversation.mvi.file_upload.T t12, @Y61.k InterfaceC32079k0 interfaceC32079k0, @Y61.k InterfaceC32069f0 interfaceC32069f0, @Y61.k com.avito.android.messenger.conversation.mvi.data.f0 f0Var, @Y61.k C30277e1 c30277e1, @Y61.k com.avito.android.messenger.channels.mvi.sync.z0 z0Var, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f91691a = interfaceC47842z;
        this.f91692b = a12;
        this.f91693c = interfaceC32095t;
        this.f91694d = interfaceC32098u0;
        this.f91695e = aVar;
        this.f91696f = bVar;
        this.f91697g = interfaceC32200a;
        this.f91698h = b12;
        this.f91699i = g12;
        this.f91700j = interfaceC35745a5;
        this.f91701k = t12;
        this.f91702l = interfaceC32079k0;
        this.f91703m = interfaceC32069f0;
        this.f91704n = f0Var;
        this.f91705o = c30277e1;
        this.f91706p = z0Var;
        this.f91707q = interfaceC28373a;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x025b  */
    @Override // com.avito.android.app.task.T
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final io.reactivex.rxjava3.internal.operators.single.C42026y a(@Y61.k com.avito.android.remote.model.messenger.message.LocalMessage r20, @Y61.k ru.avito.messenger.MessengerUserHashInfo r21, @Y61.l java.lang.Boolean r22) {
        /*
            Method dump skipped, instructions count: 797
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.app.task.C28587q0.a(com.avito.android.remote.model.messenger.message.LocalMessage, ru.avito.messenger.MessengerUserHashInfo, java.lang.Boolean):io.reactivex.rxjava3.internal.operators.single.y");
    }
}
