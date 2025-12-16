package com.avito.android.categories_global;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.InterfaceC28477j;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: CategoriesActivity.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/categories_global/CategoriesActivity;", "Lcom/avito/android/navigation/compose/d;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito-global_categories-global_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CategoriesActivity extends com.avito.android.navigation.compose.d implements InterfaceC28477j.a {

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public static final a f116302p = new a(null);

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final String f116303n = "globalCategories?categoryName={categoryName}&categoryId={categoryId}";

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final List<com.avito.android.lib.compose.design.shared.navigation.a> f116304o = Collections.singletonList(new CategoriesScreen());

    /* compiled from: CategoriesActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/categories_global/CategoriesActivity$a;", "", "<init>", "()V", "", "CATEGORY_ID_ARG", "Ljava/lang/String;", "_avito-global_categories-global_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    @Override // com.avito.android.navigation.compose.d
    @Y61.k
    public final List<com.avito.android.lib.compose.design.shared.navigation.a> a2() {
        return this.f116304o;
    }

    @Override // com.avito.android.navigation.compose.d
    @Y61.k
    /* renamed from: b2, reason: from getter */
    public final String getF116303n() {
        return this.f116303n;
    }
}
