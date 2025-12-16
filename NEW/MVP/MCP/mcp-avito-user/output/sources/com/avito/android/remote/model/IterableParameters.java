package com.avito.android.remote.model;

import UV0.b;
import Y61.k;
import Y61.l;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: IterableParameters.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0003\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003J\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\u000b\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\b*\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH&¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\b\b\u0000\u0010\b*\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/android/remote/model/IterableParameters;", "LUV0/b;", "Lcom/avito/android/remote/model/category_parameters/base/ParameterSlot;", "Landroid/os/Parcelable;", "", "id", "findParameter", "(Ljava/lang/String;)Lcom/avito/android/remote/model/category_parameters/base/ParameterSlot;", "T", "Ljava/lang/Class;", "type", "getFirstParameterOfType", "(Ljava/lang/Class;)Lcom/avito/android/remote/model/category_parameters/base/ParameterSlot;", "", "findParametersOfType", "(Ljava/lang/Class;)Ljava/util/List;", "", "iterator", "()Ljava/util/Iterator;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface IterableParameters extends b<ParameterSlot>, Parcelable {

    /* compiled from: IterableParameters.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        @k
        public static Iterator<ParameterSlot> iterator(@k IterableParameters iterableParameters) {
            return new ParametersTreeIterator(iterableParameters);
        }
    }

    @l
    ParameterSlot findParameter(@k String id2);

    @k
    <T extends ParameterSlot> List<T> findParametersOfType(@k Class<T> type);

    @Override // UV0.a
    /* synthetic */ int getCount();

    @l
    <T extends ParameterSlot> T getFirstParameterOfType(@k Class<T> type);

    @Override // UV0.a
    /* synthetic */ Object getItem(int i12);

    @Override // UV0.a
    /* synthetic */ boolean isEmpty();

    @k
    Iterator<ParameterSlot> iterator();
}
