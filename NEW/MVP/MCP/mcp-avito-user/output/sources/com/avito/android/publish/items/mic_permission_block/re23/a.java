package com.avito.android.publish.items.mic_permission_block.re23;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.publish.items.mic_permission_block.MicPermissionBlockItem;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import t3.l0;
import u3.l;

/* compiled from: PublishMicPermissionBlockItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/items/mic_permission_block/re23/a;", "LTV0/b;", "Lcom/avito/android/publish/items/mic_permission_block/re23/g;", "Lcom/avito/android/publish/items/mic_permission_block/MicPermissionBlockItem;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a implements TV0.b<g, MicPermissionBlockItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f237050a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<SimpleTestGroupWithNone> f237051b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g.a<h> f237052c = new g.a<>(R.layout.mic_permission_block_view_re23, C7143a.f237053l);

    /* compiled from: PublishMicPermissionBlockItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/publish/items/mic_permission_block/re23/h;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/publish/items/mic_permission_block/re23/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.items.mic_permission_block.re23.a$a, reason: collision with other inner class name */
    public static final class C7143a extends N implements p<ViewGroup, View, h> {

        /* renamed from: l, reason: collision with root package name */
        public static final C7143a f237053l = new C7143a();

        public C7143a() {
            super(2);
        }

        @Override // Y41.p
        public final h invoke(ViewGroup viewGroup, View view) {
            return new h(view);
        }
    }

    @Inject
    public a(@k c cVar, @l0 @k l<SimpleTestGroupWithNone> lVar) {
        this.f237050a = cVar;
        this.f237051b = lVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f237050a;
    }

    @Override // TV0.b
    @k
    public final g.a<h> b() {
        return this.f237052c;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return (aVar instanceof MicPermissionBlockItem) && this.f237051b.f439745a.f439749b.b();
    }
}
