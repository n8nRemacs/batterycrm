package androidx.fragment.app;

import android.view.View;
import androidx.core.view.C22823h0;
import java.util.Collection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: DefaultSpecialEffectsController.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010'\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\"\u0010\u0002\u001a\u001e\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u00060\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "entry", "", "", "kotlin.jvm.PlatformType", "Landroid/view/View;", "invoke", "(Ljava/util/Map$Entry;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.fragment.app.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22950h extends kotlin.jvm.internal.N implements Y41.l<Map.Entry<String, View>, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Collection<String> f46556l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22950h(Collection<String> collection) {
        super(1);
        this.f46556l = collection;
    }

    @Override // Y41.l
    public final Boolean invoke(Map.Entry<String, View> entry) {
        return Boolean.valueOf(C42745f0.r(this.f46556l, C22823h0.p(entry.getValue())));
    }
}
