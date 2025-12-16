package com.avito.android.publish.category_edit;

import android.content.res.Resources;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ViewSwitcher;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.jvm.internal.N;

/* compiled from: CategoryEditSheet.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class c extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ CategoryEditSheet f232345l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ UV0.c<TV0.a> f232346m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ CategoriesListMove f232347n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.lib.design.bottom_sheet.d f232348o;

    /* compiled from: CategoryEditSheet.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[CategoriesListMove.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CategoriesListMove categoriesListMove = CategoriesListMove.f232320b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                CategoriesListMove categoriesListMove2 = CategoriesListMove.f232320b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CategoryEditSheet categoryEditSheet, UV0.c<TV0.a> cVar, CategoriesListMove categoriesListMove, com.avito.android.lib.design.bottom_sheet.d dVar) {
        super(0);
        this.f232345l = categoryEditSheet;
        this.f232346m = cVar;
        this.f232347n = categoriesListMove;
        this.f232348o = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.a
    public final G0 invoke() throws Resources.NotFoundException {
        Animation animationLoadAnimation;
        Animation animationLoadAnimation2;
        CategoryEditSheet categoryEditSheet = this.f232345l;
        com.avito.android.publish.category_edit.di.d dVar = categoryEditSheet.f232326f0;
        if (dVar == null) {
            dVar = null;
        }
        Q q12 = (Q) dVar.get();
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) q12.f406619b;
        RecyclerView.Adapter adapter = (RecyclerView.Adapter) q12.f406620c;
        ViewSwitcher viewSwitcher = categoryEditSheet.f232331k0;
        if (viewSwitcher == null) {
            viewSwitcher = null;
        }
        ((RecyclerView) viewSwitcher.getNextView()).setAdapter(adapter);
        aVar.c(this.f232346m);
        adapter.notifyDataSetChanged();
        ViewSwitcher viewSwitcher2 = categoryEditSheet.f232331k0;
        if (viewSwitcher2 == null) {
            viewSwitcher2 = null;
        }
        CategoriesListMove categoriesListMove = this.f232347n;
        int iOrdinal = categoriesListMove.ordinal();
        com.avito.android.lib.design.bottom_sheet.d dVar2 = this.f232348o;
        if (iOrdinal == 0) {
            animationLoadAnimation = AnimationUtils.loadAnimation(dVar2.getContext(), R.anim.fade_out);
        } else if (iOrdinal == 1) {
            animationLoadAnimation = AnimationUtils.loadAnimation(dVar2.getContext(), R.anim.exit_to_left_publish);
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            animationLoadAnimation = AnimationUtils.loadAnimation(dVar2.getContext(), R.anim.exit_to_right_publish);
        }
        viewSwitcher2.setOutAnimation(animationLoadAnimation);
        ViewSwitcher viewSwitcher3 = categoryEditSheet.f232331k0;
        if (viewSwitcher3 == null) {
            viewSwitcher3 = null;
        }
        int iOrdinal2 = categoriesListMove.ordinal();
        if (iOrdinal2 == 0) {
            animationLoadAnimation2 = AnimationUtils.loadAnimation(dVar2.getContext(), R.anim.fade_in);
        } else if (iOrdinal2 == 1) {
            animationLoadAnimation2 = AnimationUtils.loadAnimation(dVar2.getContext(), R.anim.enter_from_right_publish);
        } else {
            if (iOrdinal2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            animationLoadAnimation2 = AnimationUtils.loadAnimation(dVar2.getContext(), R.anim.enter_from_left_publish);
        }
        viewSwitcher3.setInAnimation(animationLoadAnimation2);
        ViewSwitcher viewSwitcher4 = categoryEditSheet.f232331k0;
        (viewSwitcher4 != null ? viewSwitcher4 : null).showNext();
        return G0.f406611a;
    }
}
