package com.avito.android.shortcut_navigation_bar;

import android.view.View;
import com.avito.android.paranja.ParanjaState;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ShortcutUtils.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/paranja/ParanjaState$ClickPosition;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/paranja/ParanjaState$ClickPosition;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class p0 extends kotlin.jvm.internal.N implements Y41.l<ParanjaState.ClickPosition, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f283537l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f283538m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ View f283539n;

    /* compiled from: ShortcutUtils.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[ParanjaState.ClickPosition.values().length];
            try {
                iArr[4] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ParanjaState.ClickPosition clickPosition = ParanjaState.ClickPosition.f210848b;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ParanjaState.ClickPosition clickPosition2 = ParanjaState.ClickPosition.f210848b;
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ParanjaState.ClickPosition clickPosition3 = ParanjaState.ClickPosition.f210848b;
                iArr[1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                ParanjaState.ClickPosition clickPosition4 = ParanjaState.ClickPosition.f210848b;
                iArr[2] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(Y41.a<G0> aVar, Y41.a<G0> aVar2, View view) {
        super(1);
        this.f283537l = aVar;
        this.f283538m = aVar2;
        this.f283539n = view;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    @Override // Y41.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.G0 invoke(com.avito.android.paranja.ParanjaState.ClickPosition r3) {
        /*
            r2 = this;
            com.avito.android.paranja.ParanjaState$ClickPosition r3 = (com.avito.android.paranja.ParanjaState.ClickPosition) r3
            int r3 = r3.ordinal()
            Y41.a<kotlin.G0> r0 = r2.f283538m
            if (r3 == 0) goto L26
            r1 = 1
            if (r3 == r1) goto L1d
            r1 = 3
            if (r3 == r1) goto L26
            r1 = 4
            if (r3 == r1) goto L14
            goto L29
        L14:
            Y41.a<kotlin.G0> r3 = r2.f283537l
            r3.invoke()
            r0.invoke()
            goto L29
        L1d:
            android.view.View r3 = r2.f283539n
            r3.performClick()
            r0.invoke()
            goto L29
        L26:
            r0.invoke()
        L29:
            kotlin.G0 r3 = kotlin.G0.f406611a
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.shortcut_navigation_bar.p0.invoke(java.lang.Object):java.lang.Object");
    }
}
