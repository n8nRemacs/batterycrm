package com.avito.android.publish.category_edit;

import Cq0.C13343b;
import Jd0.C14188a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.category_parameters.CategoryParametersConverter;
import com.avito.android.util.rx3.g1;
import io.reactivex.rxjava3.internal.operators.single.C42007e;
import io.reactivex.rxjava3.internal.operators.single.C42026y;
import kotlin.Metadata;
import yc.C50213a;

/* compiled from: CategoryEditInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/category_edit/b;", "Lcom/avito/android/publish/category_edit/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C14188a f232340a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f232341b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Navigation f232342c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final CategoryParametersConverter f232343d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C50213a f232344e;

    public b(@Y61.k C14188a c14188a, @Y61.l String str, @Y61.k Navigation navigation2, @Y61.k CategoryParametersConverter categoryParametersConverter, @Y61.k C50213a c50213a) {
        this.f232340a = c14188a;
        this.f232341b = str;
        this.f232342c = navigation2;
        this.f232343d = categoryParametersConverter;
        this.f232344e = c50213a;
    }

    @Override // com.avito.android.publish.category_edit.a
    @Y61.k
    public final C42026y a() {
        return g1.a(new C42007e(new C13343b(this, 8)));
    }
}
