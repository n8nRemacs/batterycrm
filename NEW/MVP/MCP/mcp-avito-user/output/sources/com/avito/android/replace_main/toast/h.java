package com.avito.android.replace_main.toast;

import Y61.k;
import Y61.l;
import android.view.View;
import com.avito.android.bottom_navigation.space.BottomNavigationSpace;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ReplaceMainToastParams.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/replace_main/toast/h;", "", "_avito_replace-main_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final View f254599a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final BottomNavigationSpace f254600b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f254601c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f254602d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f254603e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f254604f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Y41.a<G0> f254605g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final Y41.a<G0> f254606h;

    public h(@k View view, @k BottomNavigationSpace bottomNavigationSpace, @k String str, boolean z12, @l String str2, @k String str3, @k Y41.a<G0> aVar, @k Y41.a<G0> aVar2) {
        this.f254599a = view;
        this.f254600b = bottomNavigationSpace;
        this.f254601c = str;
        this.f254602d = z12;
        this.f254603e = str2;
        this.f254604f = str3;
        this.f254605g = aVar;
        this.f254606h = aVar2;
    }

    public /* synthetic */ h(View view, BottomNavigationSpace bottomNavigationSpace, String str, boolean z12, String str2, String str3, Y41.a aVar, Y41.a aVar2, int i12, C42822w c42822w) {
        this(view, bottomNavigationSpace, str, (i12 & 8) != 0 ? false : z12, (i12 & 16) != 0 ? null : str2, str3, aVar, aVar2);
    }
}
