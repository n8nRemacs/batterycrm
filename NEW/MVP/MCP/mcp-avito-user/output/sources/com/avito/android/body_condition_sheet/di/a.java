package com.avito.android.body_condition_sheet.di;

import Y61.k;
import Y61.l;
import com.avito.android.body_condition_sheet.BodyConditionSheetActivity;
import com.avito.android.deep_linking.links.BodyCondition;
import com.avito.android.di.InterfaceC30272y;
import h31.d;
import kotlin.Metadata;

/* compiled from: BodyConditionSheetActivityComponent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/body_condition_sheet/di/a;", "", "a", "_avito_body-condition-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC30272y
@h31.d
/* loaded from: classes11.dex */
public interface a {

    /* compiled from: BodyConditionSheetActivityComponent.kt */
    @d.a
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/body_condition_sheet/di/a$a;", "", "_avito_body-condition-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.body_condition_sheet.di.a$a, reason: collision with other inner class name */
    public interface InterfaceC3194a {
        @h31.b
        @k
        InterfaceC3194a a(@k BodyCondition bodyCondition);

        @h31.b
        @k
        InterfaceC3194a b(@l String str);

        @k
        a build();

        @k
        InterfaceC3194a c(@k b bVar);
    }

    void a(@k BodyConditionSheetActivity bodyConditionSheetActivity);
}
