package com.avito.android.remote.model.category_parameters;

import Y41.l;
import Y61.k;
import android.os.Parcel;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.category_parameters.base.CategoryParameter;
import com.avito.android.util.J3;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: CategoryParameters.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/avito/android/remote/model/category_parameters/CategoryParameters;", "Landroid/os/Parcel;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class CategoryParameters$Companion$CREATOR$1 extends N implements l<Parcel, CategoryParameters> {
    public static final CategoryParameters$Companion$CREATOR$1 INSTANCE = new CategoryParameters$Companion$CREATOR$1();

    public CategoryParameters$Companion$CREATOR$1() {
        super(1);
    }

    @Override // Y41.l
    @k
    public final CategoryParameters invoke(@k Parcel parcel) {
        Navigation navigation2 = (Navigation) parcel.readParcelable(Navigation.class.getClassLoader());
        Navigation navigation3 = (Navigation) parcel.readParcelable(Navigation.class.getClassLoader());
        List listA = J3.a(parcel, CategoryParameter.class.getClassLoader());
        if (listA == null) {
            listA = C42784z0.f406748b;
        }
        return new CategoryParameters(navigation2, navigation3, listA, J3.a(parcel, CategoryPublishStep.class.getClassLoader()), parcel.readString(), null, null, J3.c(parcel), null, 352, null);
    }
}
