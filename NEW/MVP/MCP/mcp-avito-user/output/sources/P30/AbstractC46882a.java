package p30;

import Y61.k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: BrandModelItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lp30/a;", "LTV0/a;", "_avito_new-cars-mark-model-filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: p30.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC46882a implements TV0.a {

    /* renamed from: b, reason: collision with root package name */
    public final long f428153b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f428154c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ArrayList f428155d;

    public AbstractC46882a(long j12, @k String str, @k ArrayList arrayList) {
        this.f428153b = j12;
        this.f428154c = str;
        this.f428155d = arrayList;
    }

    @k
    public final ArrayList a() {
        return C42745f0.h0(f(), Collections.singletonList(new com.avito.android.newcars_mark_model_filter.presentation.recycler.label.a(getF189215e(), getF428154c())));
    }

    @k
    /* renamed from: b, reason: from getter */
    public String getF428154c() {
        return this.f428154c;
    }

    @k
    public List<AbstractC46883b> f() {
        return this.f428155d;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public long getF189215e() {
        return this.f428153b;
    }
}
