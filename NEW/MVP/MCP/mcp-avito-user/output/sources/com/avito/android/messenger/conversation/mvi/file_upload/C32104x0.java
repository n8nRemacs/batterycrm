package com.avito.android.messenger.conversation.mvi.file_upload;

import android.content.Context;
import android.net.Uri;
import com.avito.android.C30277e1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.analytics.C31667x;
import com.avito.android.messenger.conversation.mvi.data.InterfaceC32024m;
import com.avito.android.messenger.conversation.mvi.file_upload.AbstractC32094s0;
import com.avito.android.messenger.conversation.mvi.video.chunked_upload.InterfaceC32303b;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.internal.operators.completable.C41811b;
import io.reactivex.rxjava3.internal.operators.completable.C41823n;
import io.reactivex.rxjava3.internal.operators.single.C42022u;
import io.reactivex.rxjava3.internal.operators.single.C42026y;
import java.io.File;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import ru.avito.messenger.InterfaceC47842z;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: VideoUploadInteractor.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/file_upload/x0;", "Lcom/avito/android/messenger/conversation/mvi/file_upload/u0;", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.conversation.mvi.file_upload.x0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32104x0 implements InterfaceC32098u0 {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f191321p = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32024m f191322a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.conversation.mvi.file_attachment.n f191323b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47842z f191324c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32060b f191325d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C30277e1 f191326e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final C31667x f191327f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f191328g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Context f191329h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.conversation.mvi.video.b f191330i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.conversation.mvi.video.m f191331j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32069f0 f191332k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.C f191333l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32303b f191334m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.util.k f191335n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f191336o;

    /* compiled from: VideoUploadInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/file_upload/x0$a;", "", "<init>", "()V", "", "FALLBACK_FILE_NAME", "Ljava/lang/String;", "TAG", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.file_upload.x0$a */
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

    /* JADX WARN: Removed duplicated region for block: B:9:0x0057  */
    @javax.inject.Inject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C32104x0(@Y61.k com.avito.android.messenger.conversation.mvi.data.InterfaceC32024m r1, @Y61.k com.avito.android.messenger.conversation.mvi.file_attachment.n r2, @Y61.k ru.avito.messenger.InterfaceC47842z r3, @Y61.k com.avito.android.messenger.conversation.mvi.file_upload.InterfaceC32060b r4, @Y61.k com.avito.android.C30277e1 r5, @Y61.k com.avito.android.messenger.analytics.C31667x r6, @Y61.k com.avito.android.analytics.InterfaceC28373a r7, @Y61.k android.content.Context r8, @Y61.k com.avito.android.messenger.conversation.mvi.video.b r9, @Y61.k com.avito.android.messenger.conversation.mvi.video.m r10, @Y61.k com.avito.android.messenger.conversation.mvi.file_upload.InterfaceC32069f0 r11, @Y61.k com.avito.android.util.C r12, @Y61.k com.avito.android.messenger.conversation.mvi.video.chunked_upload.InterfaceC32303b r13, @Y61.k com.avito.android.messenger.util.k r14) {
        /*
            r0 = this;
            r0.<init>()
            r0.f191322a = r1
            r0.f191323b = r2
            r0.f191324c = r3
            r0.f191325d = r4
            r0.f191326e = r5
            r0.f191327f = r6
            r0.f191328g = r7
            r0.f191329h = r8
            r0.f191330i = r9
            r0.f191331j = r10
            r0.f191332k = r11
            r0.f191333l = r12
            r0.f191334m = r13
            r0.f191335n = r14
            kotlin.reflect.n<java.lang.Object>[] r1 = com.avito.android.C30277e1.f144946d1
            r2 = 9
            r2 = r1[r2]
            com.avito.android.A0$a r2 = r5.f145021k
            DE0.a r2 = r2.a()
            java.lang.Object r2 = r2.invoke()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L57
            int r2 = r12.getF125487g()
            r3 = 31
            if (r2 < r3) goto L55
            r2 = 37
            r1 = r1[r2]
            com.avito.android.A0$a r1 = r5.f144967K
            DE0.a r1 = r1.a()
            java.lang.Object r1 = r1.invoke()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L57
        L55:
            r1 = 1
            goto L58
        L57:
            r1 = 0
        L58:
            r0.f191336o = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.conversation.mvi.file_upload.C32104x0.<init>(com.avito.android.messenger.conversation.mvi.data.m, com.avito.android.messenger.conversation.mvi.file_attachment.n, ru.avito.messenger.z, com.avito.android.messenger.conversation.mvi.file_upload.b, com.avito.android.e1, com.avito.android.messenger.analytics.x, com.avito.android.analytics.a, android.content.Context, com.avito.android.messenger.conversation.mvi.video.b, com.avito.android.messenger.conversation.mvi.video.m, com.avito.android.messenger.conversation.mvi.file_upload.f0, com.avito.android.util.C, com.avito.android.messenger.conversation.mvi.video.chunked_upload.b, com.avito.android.messenger.util.k):void");
    }

    public static final io.reactivex.rxjava3.core.I b(C32104x0 c32104x0, io.reactivex.rxjava3.core.I i12) {
        C30277e1 c30277e1 = c32104x0.f191326e;
        c30277e1.getClass();
        kotlin.reflect.n<Object> nVar = C30277e1.f144946d1[10];
        return ((Boolean) c30277e1.f145023l.a().invoke()).booleanValue() ? i12.n(new D0(c32104x0)) : i12;
    }

    public static final io.reactivex.rxjava3.internal.operators.single.U c(final C32104x0 c32104x0, Uri uri, final File file) {
        c32104x0.getClass();
        final long length = file.length();
        g1.f191169a.getClass();
        final long jMax = length % 5242880 != 0 ? (length / 5242880) + 1 : Math.max(length / 5242880, 1L);
        return c32104x0.f191323b.i(uri, null).r(new T0(length, jMax, c32104x0, file)).u(new l41.o() { // from class: com.avito.android.messenger.conversation.mvi.file_upload.v0
            @Override // l41.o
            public final Object apply(Object obj) {
                int i12 = C32104x0.f191321p;
                File file2 = file;
                return new C32092r0(file2, null, null, c32104x0.f191323b.f(file2.getName(), null), null, length, jMax);
            }
        });
    }

    @Override // com.avito.android.messenger.conversation.mvi.file_upload.InterfaceC32098u0
    @Y61.k
    public final C42022u a(@Y61.k String str, @Y61.k String str2, @Y61.k MessengerUserHashInfo messengerUserHashInfo) {
        int i12 = 0;
        AbstractC32094s0.a aVar = new AbstractC32094s0.a(str2, str, messengerUserHashInfo);
        V2.f318762a.c("VideoUploadInteractorImpl", "Video uploading flow has started for uploadId = " + aVar, null);
        this.f191331j.a("upload.flow_started");
        io.reactivex.rxjava3.internal.operators.completable.r rVarA = this.f191325d.a();
        InterfaceC32024m interfaceC32024m = this.f191322a;
        C41811b c41811bG = rVarA.g(interfaceC32024m.e0(str, str2, messengerUserHashInfo));
        C30277e1 c30277e1 = this.f191326e;
        c30277e1.getClass();
        kotlin.reflect.n<Object> nVar = C30277e1.f144946d1[45];
        C41811b c41811bG2 = c41811bG.g(((Boolean) c30277e1.f144983S.a().invoke()).booleanValue() ? interfaceC32024m.Z(aVar.f191220c, aVar.f191218a, aVar.f191219b).n(new C32106y0(this)).o(new C32108z0(this, aVar)).r() : C41823n.f402260b);
        com.jakewharton.rxrelay3.c cVar = new com.jakewharton.rxrelay3.c();
        io.reactivex.rxjava3.core.z zVarQ = io.reactivex.rxjava3.core.z.q(io.reactivex.rxjava3.core.z.c0(e(aVar, cVar, new AtomicBoolean(false))), cVar);
        l41.o oVar = V0.f191100b;
        zVarQ.getClass();
        Objects.requireNonNull(oVar, "mapper is null");
        io.reactivex.rxjava3.internal.functions.b.a(2, "bufferSize");
        return c41811bG2.h(new io.reactivex.rxjava3.internal.operators.mixed.t(zVarQ, oVar).S()).u(new C32102w0(i12)).k(new e1(this, aVar));
    }

    public final C42026y d(Uri uri, String str) {
        com.avito.android.messenger.conversation.mvi.file_attachment.n nVar = this.f191323b;
        return ((str == null || !this.f191326e.w().invoke().booleanValue()) ? nVar.g(uri) : nVar.n(str)).n(new E0(this, uri));
    }

    public final io.reactivex.rxjava3.internal.operators.single.D e(AbstractC32094s0.a aVar, com.jakewharton.rxrelay3.c cVar, AtomicBoolean atomicBoolean) {
        return new io.reactivex.rxjava3.internal.operators.single.D(this.f191322a.c0(aVar.f191220c, aVar.f191218a, aVar.f191219b), new F0(aVar, this, cVar, atomicBoolean));
    }
}
