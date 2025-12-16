package com.avito.android.publish.screen.wrongcategory.mvi;

import Qe0.InterfaceC14888b;
import Y41.p;
import android.annotation.SuppressLint;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.publish.screen.wrongcategory.ui.SelectListWidget;
import com.avito.android.remote.model.CategoryModel;
import com.avito.android.remote.model.adverts.AdvertProactiveModerationResult;
import j.e0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: WrongCategoryBootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/screen/wrongcategory/mvi/e;", "Lcom/avito/android/arch/mvi/b;", "LQe0/b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e implements com.avito.android.arch.mvi.b<InterfaceC14888b> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AdvertProactiveModerationResult.WrongCategorySuggest f242593a;

    /* compiled from: WrongCategoryBootstrap.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LQe0/b$d;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.publish.screen.wrongcategory.mvi.WrongCategoryBootstrap$produce$1", f = "WrongCategoryBootstrap.kt", i = {}, l = {35}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super InterfaceC14888b.d>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f242594q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f242595r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = e.this.new a(continuation);
            aVar.f242595r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super InterfaceC14888b.d> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f242594q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f242595r;
                e eVar = e.this;
                List<CategoryModel> categories = eVar.f242593a.getCategories();
                ArrayList arrayList = new ArrayList(C42745f0.q(categories, 10));
                Iterator<T> it = categories.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    arrayList.add(e.c((CategoryModel) it.next(), null));
                }
                AdvertProactiveModerationResult.WrongCategorySuggest wrongCategorySuggest = eVar.f242593a;
                ArrayList arrayListI0 = C42745f0.i0(e.c(wrongCategorySuggest.getSelectedCategory(), Boxing.boxInt(R.string.wrong_category_subtitle)), arrayList);
                CategoryModel categoryModel = (CategoryModel) C42745f0.w0(wrongCategorySuggest.getCategories());
                SelectListWidget.Data dataC = categoryModel != null ? e.c(categoryModel, null) : null;
                InterfaceC14888b.d dVar = new InterfaceC14888b.d(arrayListI0, dataC, dataC != null, com.avito.android.printable_text.b.c(wrongCategorySuggest.getCategories().size() == 1 ? R.string.wrong_category_caption : R.string.wrong_category_caption_plural, new Serializable[0]));
                this.f242594q = 1;
                if (interfaceC43172j.emit(dVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    @Inject
    public e(@Y61.k AdvertProactiveModerationResult.WrongCategorySuggest wrongCategorySuggest) {
        this.f242593a = wrongCategorySuggest;
    }

    @SuppressLint({"HardcodeStringDetector"})
    public static SelectListWidget.Data c(CategoryModel categoryModel, @e0 Integer num) {
        String title;
        String description = categoryModel.getDescription();
        if (description == null || description.length() == 0) {
            title = categoryModel.getTitle();
        } else {
            title = categoryModel.getTitle() + " · " + categoryModel.getDescription();
        }
        return new SelectListWidget.Data(title, num, categoryModel.getNavigation().toString());
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<InterfaceC14888b> a() {
        return C43175k.G(new a(null));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
