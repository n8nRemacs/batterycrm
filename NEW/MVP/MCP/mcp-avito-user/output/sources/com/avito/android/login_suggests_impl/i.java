package com.avito.android.login_suggests_impl;

import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: LoginSuggestsInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/avito/android/login_suggests_impl/Suggest;", "remoteSuggestsResponse", "Lcom/avito/android/remote/model/AuthSuggestsResult;", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class i<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.collections.builders.d f182930b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f182931c;

    public i(kotlin.collections.builders.d dVar, j jVar) {
        this.f182930b = dVar;
        this.f182931c = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b6  */
    @Override // l41.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object apply(java.lang.Object r10) {
        /*
            r9 = this;
            com.avito.android.remote.model.AuthSuggestsResult r10 = (com.avito.android.remote.model.AuthSuggestsResult) r10
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            kotlin.collections.builders.d r1 = r9.f182930b
            java.util.Set r1 = r1.entrySet()
            kotlin.collections.builders.e r1 = (kotlin.collections.builders.e) r1
            java.util.Iterator r1 = r1.iterator()
        L13:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lca
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.util.List r3 = r10.getSuggests()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L29:
            boolean r4 = r3.hasNext()
            r5 = 0
            if (r4 == 0) goto L46
            java.lang.Object r4 = r3.next()
            r6 = r4
            com.avito.android.remote.model.AuthSuggestItem r6 = (com.avito.android.remote.model.AuthSuggestItem) r6
            java.lang.String r6 = r6.getHashUserId()
            java.lang.Object r7 = r2.getKey()
            boolean r6 = kotlin.jvm.internal.L.f(r6, r7)
            if (r6 == 0) goto L29
            goto L47
        L46:
            r4 = r5
        L47:
            com.avito.android.remote.model.AuthSuggestItem r4 = (com.avito.android.remote.model.AuthSuggestItem) r4
            r3 = 0
            r6 = 1
            java.lang.String r7 = ""
            if (r4 == 0) goto L7f
            java.lang.Object r8 = r2.getValue()
            com.avito.android.account.Z r8 = (com.avito.android.account.Z) r8
            java.lang.String r8 = r8.f68097b
            if (r8 == 0) goto L62
            int r8 = r8.length()
            if (r8 != 0) goto L60
            goto L62
        L60:
            r8 = r3
            goto L63
        L62:
            r8 = r6
        L63:
            if (r8 != 0) goto L7f
            com.avito.android.login_suggests_impl.Suggest$Login r5 = new com.avito.android.login_suggests_impl.Suggest$Login
            java.lang.String r3 = r4.getName()
            com.avito.android.remote.model.Image r4 = r4.getAvatar()
            java.lang.Object r2 = r2.getValue()
            com.avito.android.account.Z r2 = (com.avito.android.account.Z) r2
            java.lang.String r2 = r2.f68097b
            if (r2 != 0) goto L7a
            goto L7b
        L7a:
            r7 = r2
        L7b:
            r5.<init>(r3, r4, r7)
            goto Lc3
        L7f:
            if (r4 == 0) goto Lb6
            java.lang.Object r8 = r2.getValue()
            com.avito.android.account.Z r8 = (com.avito.android.account.Z) r8
            java.lang.String r8 = r8.f68098c
            if (r8 == 0) goto L91
            int r8 = r8.length()
            if (r8 != 0) goto L92
        L91:
            r3 = r6
        L92:
            if (r3 != 0) goto Lb6
            com.avito.android.login_suggests_impl.Suggest$Social r5 = new com.avito.android.login_suggests_impl.Suggest$Social
            java.lang.String r3 = r4.getName()
            com.avito.android.remote.model.Image r4 = r4.getAvatar()
            java.lang.Object r6 = r2.getValue()
            com.avito.android.account.Z r6 = (com.avito.android.account.Z) r6
            java.lang.String r6 = r6.f68098c
            if (r6 != 0) goto La9
            goto Laa
        La9:
            r7 = r6
        Laa:
            java.lang.Object r2 = r2.getValue()
            com.avito.android.account.Z r2 = (com.avito.android.account.Z) r2
            java.lang.String r2 = r2.f68099d
            r5.<init>(r3, r4, r7, r2)
            goto Lc3
        Lb6:
            java.lang.Object r2 = r2.getKey()
            java.lang.String r2 = (java.lang.String) r2
            com.avito.android.login_suggests_impl.j r3 = r9.f182931c
            B3.c r3 = r3.f182934c
            r3.b(r2)
        Lc3:
            if (r5 == 0) goto L13
            r0.add(r5)
            goto L13
        Lca:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.login_suggests_impl.i.apply(java.lang.Object):java.lang.Object");
    }
}
