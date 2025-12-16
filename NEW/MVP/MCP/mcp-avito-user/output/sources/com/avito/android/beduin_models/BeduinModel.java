package com.avito.android.beduin_models;

import Y41.l;
import Y61.k;
import aW.InterfaceC19825c;
import android.os.Parcelable;
import java.util.List;
import kotlin.Metadata;

/* compiled from: BeduinModel.kt */
@InterfaceC19825c
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin_models/BeduinModel;", "Landroid/os/Parcelable;", "_avito_beduin-models_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface BeduinModel extends Parcelable {

    /* compiled from: BeduinModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @k
    BeduinModel apply(@k BeduinModelTransform beduinModelTransform);

    @k
    List<BeduinModel> flatMap(@k l<? super BeduinModel, ? extends List<? extends BeduinModel>> lVar);

    void forEach(@k l<? super BeduinModel, Boolean> lVar);

    @Y61.l
    /* renamed from: getDisplayingPredicate */
    DisplayingPredicate getF102397d();

    @k
    String getId();

    boolean isValid();
}
