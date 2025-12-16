package com.avito.android.beduin.network.parse;

import Y61.k;
import com.avito.android.beduin.network.model.Constraint;
import com.avito.android.remote.parse.adapter.RuntimeTypeAdapter;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: BeduinConstraintTypeAdapter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/network/parse/BeduinConstraintTypeAdapter;", "Lcom/avito/android/remote/parse/adapter/RuntimeTypeAdapter;", "Lcom/avito/android/beduin/network/model/Constraint;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BeduinConstraintTypeAdapter extends RuntimeTypeAdapter<Constraint> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Object f104040a;

    public BeduinConstraintTypeAdapter() {
        super(null, null, null, 7, null);
        this.f104040a = P0.g(new Q("length", Constraint.Length.class), new Q("notEmpty", Constraint.NotEmpty.class), new Q("regularExpression", Constraint.Regexp.class));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map<java.lang.String, java.lang.Class<? extends com.avito.android.beduin.network.model.Constraint>>] */
    @Override // com.avito.android.remote.parse.adapter.RuntimeTypeAdapter
    @k
    public final Map<String, Class<? extends Constraint>> getMapping() {
        return this.f104040a;
    }
}
