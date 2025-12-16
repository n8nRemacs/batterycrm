package tC0;

import Y61.k;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.tariff_cpt.common.item.screen_title.g;
import com.avito.android.util.y6;
import kC0.AbstractC42569b;
import kotlin.Metadata;

/* compiled from: CptMigrationItemDecoration.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LtC0/a;", "LkC0/b;", "<init>", "()V", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: tC0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C48535a extends AbstractC42569b {

    /* renamed from: e, reason: collision with root package name */
    public final int f439200e = y6.b(16);

    /* renamed from: f, reason: collision with root package name */
    public final int f439201f = y6.b(24);

    /* renamed from: g, reason: collision with root package name */
    public final int f439202g = y6.b(8);

    @Override // kC0.AbstractC42569b
    public final int c(@k View view, @k RecyclerView recyclerView) {
        if (recyclerView.W(view) instanceof g) {
            return this.f439202g;
        }
        return 0;
    }

    @Override // kC0.AbstractC42569b
    public final int e(@k View view, @k RecyclerView recyclerView) {
        return recyclerView.W(view) instanceof com.avito.android.tariff_cpt.configure.migration.item.terms.g ? this.f439201f : this.f406200b;
    }

    @Override // kC0.AbstractC42569b
    public final int f(@k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        return recyclerView.W(view) instanceof com.avito.android.tariff_cpt.configure.migration.item.terms.g ? this.f439200e : super.f(view, recyclerView, zVar);
    }
}
