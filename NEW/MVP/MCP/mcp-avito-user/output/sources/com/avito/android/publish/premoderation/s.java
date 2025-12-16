package com.avito.android.publish.premoderation;

import android.annotation.SuppressLint;
import androidx.compose.runtime.internal.P;
import androidx.view.C23038g0;
import androidx.view.C23060r0;
import androidx.view.M0;
import com.avito.android.publish.premoderation.SelectListWidget;
import com.avito.android.remote.model.CategoryModel;
import com.avito.android.remote.model.adverts.AdvertProactiveModerationResult;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: WrongCategoryViewModel.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/premoderation/s;", "Landroidx/lifecycle/M0;", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class s extends M0 {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final AdvertProactiveModerationResult.WrongCategorySuggest f238332E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final String f238333J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final r f238334K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final C23060r0 f238335L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final C23038g0<a> f238336M = new C23038g0<>();

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final C23038g0<Boolean> f238337N = new C23038g0<>();

    /* compiled from: WrongCategoryViewModel.kt */
    @P
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/publish/premoderation/s$a;", "", "<init>", "()V", "a", "Lcom/avito/android/publish/premoderation/s$a$a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class a {

        /* compiled from: WrongCategoryViewModel.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/premoderation/s$a$a;", "Lcom/avito/android/publish/premoderation/s$a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.publish.premoderation.s$a$a, reason: collision with other inner class name */
        public static final /* data */ class C7160a extends a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final ArrayList f238338a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final SelectListWidget.a f238339b;

            public C7160a(@Y61.k ArrayList arrayList, @Y61.l SelectListWidget.a aVar) {
                super(null);
                this.f238338a = arrayList;
                this.f238339b = aVar;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C7160a)) {
                    return false;
                }
                C7160a c7160a = (C7160a) obj;
                return L.f(this.f238338a, c7160a.f238338a) && L.f(this.f238339b, c7160a.f238339b);
            }

            public final int hashCode() {
                int iHashCode = this.f238338a.hashCode() * 31;
                SelectListWidget.a aVar = this.f238339b;
                return iHashCode + (aVar == null ? 0 : aVar.hashCode());
            }

            @Y61.k
            public final String toString() {
                return "Categories(items=" + this.f238338a + ", checkedItem=" + this.f238339b + ')';
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public s(@Y61.k AdvertProactiveModerationResult.WrongCategorySuggest wrongCategorySuggest, @Y61.k String str, @Y61.k r rVar, @Y61.k C23060r0 c23060r0) {
        this.f238332E = wrongCategorySuggest;
        this.f238333J = str;
        this.f238334K = rVar;
        this.f238335L = c23060r0;
    }

    @SuppressLint({"HardcodeStringDetector"})
    public static SelectListWidget.a ke(CategoryModel categoryModel, String str) {
        String title;
        String description = categoryModel.getDescription();
        if (description == null || description.length() == 0) {
            title = categoryModel.getTitle();
        } else {
            title = categoryModel.getTitle() + " · " + categoryModel.getDescription();
        }
        return new SelectListWidget.a(title, str, categoryModel.getNavigation().toString());
    }
}
