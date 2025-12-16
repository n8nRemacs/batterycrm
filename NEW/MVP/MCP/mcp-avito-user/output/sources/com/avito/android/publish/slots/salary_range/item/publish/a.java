package com.avito.android.publish.slots.salary_range.item.publish;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import t3.l0;
import u3.l;

/* compiled from: PublishSalaryRangeBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/slots/salary_range/item/publish/a;", "LTV0/b;", "Lcom/avito/android/publish/slots/salary_range/item/publish/b;", "Lcom/avito/android/publish/slots/salary_range/item/c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a implements TV0.b<b, com.avito.android.publish.slots.salary_range.item.c> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f244815a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f244816b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final l<SimpleTestGroupWithNone> f244817c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final g.a<c> f244818d = new g.a<>(R.layout.view_publish_salary_range_container, new C7332a());

    /* compiled from: PublishSalaryRangeBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/publish/slots/salary_range/item/publish/c;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/publish/slots/salary_range/item/publish/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.slots.salary_range.item.publish.a$a, reason: collision with other inner class name */
    public static final class C7332a extends N implements p<ViewGroup, View, c> {
        public C7332a() {
            super(2);
        }

        @Override // Y41.p
        public final c invoke(ViewGroup viewGroup, View view) {
            return new c(view, a.this.f244816b);
        }
    }

    public a(@k d dVar, @k com.avito.android.util.text.a aVar, @l0 @k l<SimpleTestGroupWithNone> lVar) {
        this.f244815a = dVar;
        this.f244816b = aVar;
        this.f244817c = lVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f244815a;
    }

    @Override // TV0.b
    @k
    public final g.a<c> b() {
        return this.f244818d;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return (aVar instanceof com.avito.android.publish.slots.salary_range.item.c) && this.f244817c.f439745a.f439749b.b();
    }
}
