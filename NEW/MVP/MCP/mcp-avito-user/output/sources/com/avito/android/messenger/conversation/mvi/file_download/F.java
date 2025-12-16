package com.avito.android.messenger.conversation.mvi.file_download;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Completables.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "T", "Lkotlin/G0;", "it", "Lio/reactivex/rxjava3/core/O;", "apply", "(Lkotlin/G0;)Lio/reactivex/rxjava3/core/O;", "com/avito/android/util/rx3/b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class F<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f190788b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f190789c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ File f190790d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f190791e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f190792f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f190793g;

    public F(boolean z12, x xVar, File file, String str, String str2, boolean z13) {
        this.f190788b = z12;
        this.f190789c = xVar;
        this.f190790d = file;
        this.f190791e = str;
        this.f190792f = str2;
        this.f190793g = z13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    @Override // l41.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object apply(java.lang.Object r6) {
        /*
            r5 = this;
            kotlin.G0 r6 = (kotlin.G0) r6
            boolean r6 = r5.f190788b
            java.io.File r0 = r5.f190790d
            com.avito.android.messenger.conversation.mvi.file_download.x r1 = r5.f190789c
            if (r6 == 0) goto L5f
            r1.getClass()
            r6 = 0
            java.nio.charset.Charset r2 = kotlin.text.C43047d.f410591d     // Catch: java.lang.Throwable -> L3e
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L3e
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L3e
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L3e
            r3.<init>(r4, r2)     // Catch: java.lang.Throwable -> L3e
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L3e
            r4 = 8192(0x2000, float:1.148E-41)
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L3e
            r3 = 4
            char[] r4 = new char[r3]     // Catch: java.lang.Throwable -> L37
            r2.read(r4, r6, r3)     // Catch: java.lang.Throwable -> L37
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.Throwable -> L37
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L37
            r4 = 0
            kotlin.io.c.a(r2, r4)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r2 = "OggS"
            boolean r6 = r3.equals(r2)     // Catch: java.lang.Throwable -> L3e
            goto L3e
        L37:
            r3 = move-exception
            throw r3     // Catch: java.lang.Throwable -> L39
        L39:
            r4 = move-exception
            kotlin.io.c.a(r2, r3)     // Catch: java.lang.Throwable -> L3e
            throw r4     // Catch: java.lang.Throwable -> L3e
        L3e:
            if (r6 == 0) goto L5f
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r2 = "voice_"
            r6.<init>(r2)
            long r2 = java.lang.System.currentTimeMillis()
            r6.append(r2)
            java.lang.String r2 = ".ogg"
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            kotlin.Q r2 = new kotlin.Q
            java.lang.String r3 = "audio/ogg"
            r2.<init>(r6, r3)
            goto L68
        L5f:
            kotlin.Q r2 = new kotlin.Q
            java.lang.String r6 = r5.f190791e
            java.lang.String r3 = r5.f190792f
            r2.<init>(r6, r3)
        L68:
            A r6 = r2.f406619b
            java.lang.String r6 = (java.lang.String) r6
            B r2 = r2.f406620c
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = r5.f190793g
            if (r3 == 0) goto L7b
            com.avito.android.messenger.conversation.mvi.file_attachment.n r1 = r1.f190964e
            io.reactivex.rxjava3.internal.operators.single.G r6 = r1.c(r0, r6, r2)
            goto L81
        L7b:
            com.avito.android.messenger.conversation.mvi.file_attachment.n r1 = r1.f190964e
            io.reactivex.rxjava3.internal.operators.single.G r6 = r1.w(r0, r6)
        L81:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.conversation.mvi.file_download.F.apply(java.lang.Object):java.lang.Object");
    }
}
