package com.avito.android.mortgage.root.list.items.team;

import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TeamBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/team/a;", "LTV0/b;", "Lcom/avito/android/mortgage/root/list/items/team/l;", "Lcom/avito/android/mortgage/root/list/items/team/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a implements TV0.b<l, c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final j f202850a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<o> f202851b = new g.a<>(R.layout.compose_content_layout, C6039a.f202852l);

    /* compiled from: TeamBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/mortgage/root/list/items/team/o;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/mortgage/root/list/items/team/o;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.mortgage.root.list.items.team.a$a, reason: collision with other inner class name */
    public static final class C6039a extends N implements p<ViewGroup, View, o> {

        /* renamed from: l, reason: collision with root package name */
        public static final C6039a f202852l = new C6039a();

        public C6039a() {
            super(2);
        }

        @Override // Y41.p
        public final o invoke(ViewGroup viewGroup, View view) {
            return new o(view);
        }
    }

    @Inject
    public a(@Y61.k j jVar) {
        this.f202850a = jVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f202850a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<o> b() {
        return this.f202851b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof c;
    }
}
