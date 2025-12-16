package com.avito.android.rating_form.api.remote.di;

import com.avito.android.rating_form.api.remote.model.RatingFormAddValueType;
import com.avito.android.rating_form.api.remote.model.RatingFormField;
import com.avito.android.rating_form.api.remote.parse.DialogActionAdapter;
import com.avito.android.rating_form.api.remote.parse.DialogOnCloseActionAdapter;
import com.avito.android.rating_form.api.remote.parse.ItemTypeAdapter;
import com.avito.android.rating_form.api.remote.parse.ValueTypeAdapter;
import com.avito.android.util.X5;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: RatingFormJsonModule_ProvideTypeAdaptersFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes16.dex */
public final class e implements h<Set<X5>> {

    /* compiled from: RatingFormJsonModule_ProvideTypeAdaptersFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final e f247974a = new e();
    }

    public static e a() {
        return a.f247974a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.rating_form.api.remote.di.a.f247970a.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new X5(RatingFormField.ValueType.class, new ValueTypeAdapter()));
        linkedHashSet.add(new X5(RatingFormAddValueType.Dialog.DialogData.DialogAction.class, new DialogActionAdapter()));
        linkedHashSet.add(new X5(RatingFormAddValueType.Dialog.DialogData.OnCloseAction.class, new DialogOnCloseActionAdapter()));
        linkedHashSet.add(new X5(RatingFormAddValueType.RatingFormItem.class, new ItemTypeAdapter()));
        return linkedHashSet;
    }
}
