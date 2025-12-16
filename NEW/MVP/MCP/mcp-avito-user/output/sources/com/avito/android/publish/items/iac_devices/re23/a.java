package com.avito.android.publish.items.iac_devices.re23;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.publish.items.iac_devices.IacDevicesItem;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import t3.l0;
import u3.l;

/* compiled from: PublishIacDevicesItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/items/iac_devices/re23/a;", "LTV0/b;", "Lcom/avito/android/publish/items/iac_devices/re23/h;", "Lcom/avito/android/publish/items/iac_devices/IacDevicesItem;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a implements TV0.b<h, IacDevicesItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f236884a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f236885b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final l<SimpleTestGroupWithNone> f236886c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final g.a<i> f236887d = new g.a<>(R.layout.publish_iac_devices_item_container, new C7137a());

    /* compiled from: PublishIacDevicesItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/publish/items/iac_devices/re23/i;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/publish/items/iac_devices/re23/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.items.iac_devices.re23.a$a, reason: collision with other inner class name */
    public static final class C7137a extends N implements p<ViewGroup, View, i> {
        public C7137a() {
            super(2);
        }

        @Override // Y41.p
        public final i invoke(ViewGroup viewGroup, View view) {
            return new i(view, a.this.f236885b);
        }
    }

    @Inject
    public a(@k c cVar, @k com.avito.android.util.text.a aVar, @l0 @k l<SimpleTestGroupWithNone> lVar) {
        this.f236884a = cVar;
        this.f236885b = aVar;
        this.f236886c = lVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f236884a;
    }

    @Override // TV0.b
    @k
    public final g.a<i> b() {
        return this.f236887d;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return (aVar instanceof IacDevicesItem) && this.f236886c.f439745a.f439749b.b();
    }
}
