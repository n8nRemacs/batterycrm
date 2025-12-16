package com.avito.android.messenger.conversation.mvi.file_upload;

import com.avito.android.persistence.messenger.TransferStatus;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: MessengerVideoUploadCanceller.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/android/persistence/messenger/x2;", "uploadParts", "Lio/reactivex/rxjava3/core/g;", "apply", "(Ljava/util/List;)Lio/reactivex/rxjava3/core/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.file_upload.i0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32075i0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f191178b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MessengerUserHashInfo f191179c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f191180d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C32071g0 f191181e;

    /* compiled from: MessengerVideoUploadCanceller.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.file_upload.i0$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f191182a;

        static {
            int[] iArr = new int[TransferStatus.values().length];
            try {
                iArr[TransferStatus.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransferStatus.IN_PROGRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TransferStatus.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TransferStatus.SUCCESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f191182a = iArr;
        }
    }

    public C32075i0(String str, MessengerUserHashInfo messengerUserHashInfo, String str2, C32071g0 c32071g0) {
        this.f191178b = str;
        this.f191179c = messengerUserHashInfo;
        this.f191180d = str2;
        this.f191181e = c32071g0;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0085 A[Catch: all -> 0x0071, TryCatch #0 {all -> 0x0071, blocks: (B:13:0x0063, B:16:0x006d, B:25:0x0081, B:27:0x0085, B:28:0x0089, B:30:0x008d, B:21:0x0074, B:23:0x007a, B:24:0x007d), top: B:36:0x0063, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0089 A[Catch: all -> 0x0071, TryCatch #0 {all -> 0x0071, blocks: (B:13:0x0063, B:16:0x006d, B:25:0x0081, B:27:0x0085, B:28:0x0089, B:30:0x008d, B:21:0x0074, B:23:0x007a, B:24:0x007d), top: B:36:0x0063, inners: #1 }] */
    @Override // l41.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object apply(java.lang.Object r15) {
        /*
            r14 = this;
            java.util.List r15 = (java.util.List) r15
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.C42745f0.q(r15, r1)
            r0.<init>(r1)
            java.util.Iterator r15 = r15.iterator()
        L13:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto La6
            java.lang.Object r1 = r15.next()
            com.avito.android.persistence.messenger.x2 r1 = (com.avito.android.persistence.messenger.C33136x2) r1
            com.avito.android.persistence.messenger.TransferStatus r2 = r1.f215577g
            int[] r3 = com.avito.android.messenger.conversation.mvi.file_upload.C32075i0.a.f191182a
            int r2 = r2.ordinal()
            r2 = r3[r2]
            com.avito.android.messenger.conversation.mvi.file_upload.g0 r3 = r14.f191181e
            r4 = 1
            if (r2 == r4) goto L35
            r5 = 2
            if (r2 == r5) goto L35
            r5 = 3
            if (r2 == r5) goto L35
            goto L97
        L35:
            com.avito.android.messenger.conversation.mvi.file_upload.s0$b r2 = new com.avito.android.messenger.conversation.mvi.file_upload.s0$b
            long r10 = r1.f215574d
            long r12 = r1.f215575e
            java.lang.String r7 = r14.f191178b
            ru.avito.messenger.MessengerUserHashInfo r8 = r14.f191179c
            java.lang.String r9 = r14.f191180d
            r6 = r2
            r6.<init>(r7, r8, r9, r10, r12)
            com.avito.android.messenger.conversation.mvi.video.chunked_upload.b r5 = r3.f191168d
            io.reactivex.rxjava3.internal.operators.completable.I r2 = r5.b(r2)
            l41.a r5 = io.reactivex.rxjava3.internal.functions.a.f401993c
            l41.g<java.lang.Throwable> r6 = io.reactivex.rxjava3.internal.functions.a.f401995e
            java.lang.String r7 = "onComplete is null"
            java.util.Objects.requireNonNull(r5, r7)
            java.lang.String r5 = "onError is null"
            java.util.Objects.requireNonNull(r6, r5)
            io.reactivex.rxjava3.internal.observers.j r5 = new io.reactivex.rxjava3.internal.observers.j
            r5.<init>()
            r2.a(r5)
            l41.g<java.lang.Object> r2 = io.reactivex.rxjava3.internal.functions.a.f401994d
            long r7 = r5.getCount()     // Catch: java.lang.Throwable -> L71
            r9 = 0
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L81
            r5.await()     // Catch: java.lang.Throwable -> L71 java.lang.InterruptedException -> L73
            goto L81
        L71:
            r2 = move-exception
            goto L91
        L73:
            r2 = move-exception
            r5.f402111e = r4     // Catch: java.lang.Throwable -> L71
            io.reactivex.rxjava3.disposables.d r4 = r5.f402110d     // Catch: java.lang.Throwable -> L71
            if (r4 == 0) goto L7d
            r4.dispose()     // Catch: java.lang.Throwable -> L71
        L7d:
            r6.accept(r2)     // Catch: java.lang.Throwable -> L71
            goto L97
        L81:
            java.lang.Throwable r4 = r5.f402109c     // Catch: java.lang.Throwable -> L71
            if (r4 == 0) goto L89
            r6.accept(r4)     // Catch: java.lang.Throwable -> L71
            goto L97
        L89:
            T r4 = r5.f402108b     // Catch: java.lang.Throwable -> L71
            if (r4 == 0) goto L97
            r2.getClass()     // Catch: java.lang.Throwable -> L71
            goto L97
        L91:
            io.reactivex.rxjava3.exceptions.a.a(r2)
            s41.C47998a.b(r2)
        L97:
            com.avito.android.messenger.conversation.mvi.file_attachment.n r2 = r3.f191166b
            java.lang.String r3 = "MessengerVideoUploadCanceller"
            java.lang.String r1 = r1.f215576f
            io.reactivex.rxjava3.core.a r1 = com.avito.android.messenger.conversation.mvi.file_attachment.y.a(r2, r1, r3)
            r0.add(r1)
            goto L13
        La6:
            io.reactivex.rxjava3.internal.operators.completable.F r15 = io.reactivex.rxjava3.core.AbstractC41768a.p(r0)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.conversation.mvi.file_upload.C32075i0.apply(java.lang.Object):java.lang.Object");
    }
}
