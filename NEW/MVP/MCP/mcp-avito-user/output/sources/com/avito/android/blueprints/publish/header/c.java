package com.avito.android.blueprints.publish.header;

import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.Q1;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.reflect.n;

/* compiled from: HeaderItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/blueprints/publish/header/c;", "Lcom/avito/android/blueprints/publish/header/b;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final e f106206a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<l> f106207b;

    /* compiled from: HeaderItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "view", "Lcom/avito/android/blueprints/publish/header/l;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/blueprints/publish/header/l;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, l> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Q1 f106208l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Q1 q12) {
            super(2);
            this.f106208l = q12;
        }

        @Override // Y41.p
        public final l invoke(ViewGroup viewGroup, View view) {
            View view2 = view;
            Q1 q12 = this.f106208l;
            q12.getClass();
            n<Object> nVar = Q1.f67448x0[78];
            return new l(view2, viewGroup, ((Boolean) q12.f67497l0.a().invoke()).booleanValue());
        }
    }

    @Inject
    public c(@Y61.k e eVar, @Y61.k Q1 q12) {
        this.f106206a = eVar;
        this.f106207b = new g.a<>(R.layout.publish_details_header_with_divider_view, new a(q12));
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f106206a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<l> b() {
        return this.f106207b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof HeaderItem;
    }
}
