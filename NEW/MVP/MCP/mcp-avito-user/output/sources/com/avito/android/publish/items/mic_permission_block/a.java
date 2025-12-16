package com.avito.android.publish.items.mic_permission_block;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import t3.l0;
import u3.l;

/* compiled from: MicPermissionBlockItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/items/mic_permission_block/a;", "LTV0/b;", "Lcom/avito/android/publish/items/mic_permission_block/g;", "Lcom/avito/android/publish/items/mic_permission_block/MicPermissionBlockItem;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a implements TV0.b<g, MicPermissionBlockItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f237034a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<SimpleTestGroupWithNone> f237035b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g.a<h> f237036c = new g.a<>(R.layout.mic_permission_block_view, C7142a.f237037l);

    /* compiled from: MicPermissionBlockItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/publish/items/mic_permission_block/h;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/publish/items/mic_permission_block/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.items.mic_permission_block.a$a, reason: collision with other inner class name */
    public static final class C7142a extends N implements p<ViewGroup, View, h> {

        /* renamed from: l, reason: collision with root package name */
        public static final C7142a f237037l = new C7142a();

        public C7142a() {
            super(2);
        }

        @Override // Y41.p
        public final h invoke(ViewGroup viewGroup, View view) {
            return new h(view);
        }
    }

    @Inject
    public a(@k c cVar, @l0 @k l<SimpleTestGroupWithNone> lVar) {
        this.f237034a = cVar;
        this.f237035b = lVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f237034a;
    }

    @Override // TV0.b
    @k
    public final g.a<h> b() {
        return this.f237036c;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return (aVar instanceof MicPermissionBlockItem) && !this.f237035b.f439745a.f439749b.b();
    }
}
