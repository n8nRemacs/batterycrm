package com.avito.android.messenger.blacklist.mvi;

import androidx.recyclerview.widget.C23424o;
import com.avito.android.messenger.blacklist.mvi.G;
import com.avito.android.util.V2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Renderers.kt */
@s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u000b\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u0004\b\u0001\u0010\u00022*\u0010\u0006\u001a&\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0004 \u0005*\u0012\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "StateT", "Item", "Lkotlin/Q;", "Landroidx/recyclerview/widget/o$e;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lkotlin/G0;", "invoke", "(Lkotlin/Q;)V", "T20/d", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.blacklist.mvi.g, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C31677g extends kotlin.jvm.internal.N implements Y41.l<kotlin.Q<? extends G.a, ? extends C23424o.e>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ P f186464l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.jakewharton.rxrelay3.b f186465m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31677g(P p12, com.jakewharton.rxrelay3.b bVar) {
        super(1);
        this.f186464l = p12;
        this.f186465m = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.l
    public final G0 invoke(kotlin.Q<? extends G.a, ? extends C23424o.e> q12) {
        kotlin.Q<? extends G.a, ? extends C23424o.e> q13 = q12;
        Object obj = q13.f406619b;
        C23424o.e eVar = (C23424o.e) q13.f406620c;
        P p12 = this.f186464l;
        p12.c();
        p12.h(obj, eVar);
        V2 v22 = V2.f318762a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[" + Thread.currentThread().getName() + ']');
        sb2.append(" Rendered ");
        sb2.append(obj);
        v22.g("BlacklistFragment", sb2.toString());
        G0 g02 = G0.f406611a;
        this.f186465m.accept(g02);
        return g02;
    }
}
