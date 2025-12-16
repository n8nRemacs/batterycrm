package com.avito.android.crm_candidates.view.list_items.survey_results;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.docking_badge.DockingBadgeType;
import com.avito.android.util.C35835l0;
import com.avito.android.util.I5;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: JobCrmResultsPropertyView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/crm_candidates/view/list_items/survey_results/l;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/crm_candidates/view/list_items/survey_results/k;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class l extends com.avito.konveyor.adapter.b implements k {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f130265b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f130266c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f130267d;

    /* compiled from: JobCrmResultsPropertyView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f130268a;

        static {
            int[] iArr = new int[DockingBadgeType.Predefined.values().length];
            try {
                iArr[DockingBadgeType.Predefined.Green.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DockingBadgeType.Predefined.Violet.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DockingBadgeType.Predefined.Blue.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DockingBadgeType.Predefined.Gray.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DockingBadgeType.Predefined.Red.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DockingBadgeType.Predefined.Black.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f130268a = iArr;
        }
    }

    public l(@Y61.k View view) {
        super(view);
        this.f130265b = view;
        View viewFindViewById = view.findViewById(R.id.property_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f130266c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.property_value);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f130267d = (TextView) viewFindViewById2;
    }

    @Override // com.avito.android.crm_candidates.view.list_items.survey_results.k
    public final void b20(@Y61.k DockingBadgeType.Predefined predefined) {
        int i12;
        Context context = this.f130265b.getContext();
        switch (a.f130268a[predefined.ordinal()]) {
            case 1:
                i12 = R.attr.green600;
                break;
            case 2:
                i12 = R.attr.violet600;
                break;
            case 3:
                i12 = R.attr.blue600;
                break;
            case 4:
                i12 = R.attr.gray54;
                break;
            case 5:
                i12 = R.attr.red600;
                break;
            case 6:
                i12 = R.attr.black;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        this.f130267d.setTextColor(C35835l0.d(i12, context));
    }

    @Override // com.avito.android.crm_candidates.view.list_items.survey_results.k
    public final void m(@Y61.k String str) {
        I5.a(this.f130267d, str, false);
    }

    @Override // com.avito.android.crm_candidates.view.list_items.survey_results.k
    public final void setTitle(@Y61.k String str) {
        I5.a(this.f130266c, str.concat(":"), false);
    }
}
