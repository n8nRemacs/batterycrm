package com.avito.android.category_items_tree.screens.tree_screen.components;

import androidx.compose.runtime.C22066f2;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TreeScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class z extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AttributedText f117096l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AttributedText f117097m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ List<com.avito.android.category_items_tree.screens.tree_screen.k> f117098n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.l<com.avito.android.category_items_tree.screens.tree_screen.k, G0> f117099o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f117100p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f117101q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(AttributedText attributedText, AttributedText attributedText2, List list, Y41.l lVar, androidx.compose.ui.v vVar, int i12) {
        super(2);
        this.f117096l = attributedText;
        this.f117097m = attributedText2;
        this.f117098n = list;
        this.f117099o = lVar;
        this.f117100p = vVar;
        this.f117101q = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f117101q | 1);
        AttributedText attributedText = this.f117097m;
        List<com.avito.android.category_items_tree.screens.tree_screen.k> list = this.f117098n;
        w.b(this.f117096l, attributedText, list, this.f117099o, this.f117100p, a12, iA2);
        return G0.f406611a;
    }
}
