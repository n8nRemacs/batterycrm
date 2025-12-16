package sC0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.colorspace.e;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: CptMigrationModel.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LsC0/a;", "", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: sC0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* data */ class C48030a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ArrayList f437543a;

    public C48030a(@k ArrayList arrayList) {
        this.f437543a = arrayList;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C48030a) && this.f437543a.equals(((C48030a) obj).f437543a);
    }

    public final int hashCode() {
        return this.f437543a.hashCode();
    }

    @k
    public final String toString() {
        return e.p(new StringBuilder("CptMigrationModel(items="), this.f437543a, ')');
    }
}
