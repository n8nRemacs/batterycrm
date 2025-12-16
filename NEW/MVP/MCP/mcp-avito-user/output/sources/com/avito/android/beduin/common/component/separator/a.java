package com.avito.android.beduin.common.component.separator;

import Y61.k;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.beduin.common.component.h;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import java.util.Collections;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinSeparatorComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/separator/a;", "Lcom/avito/android/beduin/common/component/h;", "Lcom/avito/android/beduin/common/component/separator/BeduinSeparatorModel;", "Landroid/view/View;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a extends h<BeduinSeparatorModel, View> {

    /* renamed from: e, reason: collision with root package name */
    @k
    public final BeduinSeparatorModel f102577e;

    /* compiled from: BeduinSeparatorComponent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/separator/a$a;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.component.separator.a$a, reason: collision with other inner class name */
    public static final class C3072a implements com.avito.android.beduin.common.component.b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<String> f102578a = Collections.singletonList("separator");

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Class<? extends BeduinModel> f102579b = BeduinSeparatorModel.class;

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final Class<? extends BeduinModel> S() {
            return this.f102579b;
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final List<String> a() {
            return this.f102578a;
        }
    }

    /* compiled from: BeduinSeparatorComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f102580a;

        static {
            int[] iArr = new int[SeparatorStyle.values().length];
            try {
                iArr[SeparatorStyle.LEFT_INSET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SeparatorStyle.SIDE_INSET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SeparatorStyle.FULL_WIDTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f102580a = iArr;
        }
    }

    public a(@k BeduinSeparatorModel beduinSeparatorModel) {
        this.f102577e = beduinSeparatorModel;
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f102577e;
    }

    @Override // com.avito.android.beduin.common.component.h
    @k
    public final View p(@k ViewGroup viewGroup, @k ViewGroup.LayoutParams layoutParams) {
        View view = new View(viewGroup.getContext());
        view.setId(R.id.beduin_separator);
        view.setLayoutParams(layoutParams);
        return view;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final void q(@k View view) {
        Resources resources = view.getResources();
        Integer numValueOf = Integer.valueOf(resources.getDimensionPixelOffset(R.dimen.separator_height));
        Integer numValueOf2 = Integer.valueOf(resources.getDimensionPixelOffset(R.dimen.separator_padding));
        int iIntValue = numValueOf.intValue();
        int iIntValue2 = numValueOf2.intValue();
        view.setBackgroundColor(C35835l0.d(R.attr.gray8, view.getContext()));
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = iIntValue;
        int i12 = b.f102580a[this.f102577e.getStyle().ordinal()];
        if (i12 == 1) {
            D6.c(view, Integer.valueOf(iIntValue2), null, 0, null, 10);
            G0 g02 = G0.f406611a;
        } else if (i12 == 2) {
            D6.c(view, Integer.valueOf(iIntValue2), null, Integer.valueOf(iIntValue2), null, 10);
            G0 g03 = G0.f406611a;
        } else {
            if (i12 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            D6.c(view, 0, null, 0, null, 10);
            G0 g04 = G0.f406611a;
        }
    }
}
