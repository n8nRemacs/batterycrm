package Z00;

import Y61.k;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: MortgageRootItemDecoration.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZ00/d;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d extends RecyclerView.l {

    /* renamed from: A, reason: collision with root package name */
    public final int f19762A;

    /* renamed from: B, reason: collision with root package name */
    public final int f19763B;

    /* renamed from: C, reason: collision with root package name */
    public final int f19764C;

    /* renamed from: D, reason: collision with root package name */
    public final int f19765D;

    /* renamed from: E, reason: collision with root package name */
    public final int f19766E;

    /* renamed from: F, reason: collision with root package name */
    public final int f19767F;

    /* renamed from: G, reason: collision with root package name */
    public final int f19768G;

    /* renamed from: H, reason: collision with root package name */
    public final int f19769H;

    /* renamed from: I, reason: collision with root package name */
    public final int f19770I;

    /* renamed from: J, reason: collision with root package name */
    public final int f19771J;

    /* renamed from: K, reason: collision with root package name */
    public final int f19772K;

    /* renamed from: L, reason: collision with root package name */
    public final int f19773L;

    /* renamed from: M, reason: collision with root package name */
    public final int f19774M;

    /* renamed from: N, reason: collision with root package name */
    public final int f19775N;

    /* renamed from: O, reason: collision with root package name */
    public final int f19776O;

    /* renamed from: P, reason: collision with root package name */
    public final int f19777P;

    /* renamed from: Q, reason: collision with root package name */
    public final int f19778Q;

    /* renamed from: R, reason: collision with root package name */
    public final int f19779R;

    /* renamed from: S, reason: collision with root package name */
    public final int f19780S;

    /* renamed from: T, reason: collision with root package name */
    public final int f19781T;

    /* renamed from: U, reason: collision with root package name */
    public final int f19782U;

    /* renamed from: V, reason: collision with root package name */
    public final int f19783V;

    /* renamed from: W, reason: collision with root package name */
    public final int f19784W;

    /* renamed from: X, reason: collision with root package name */
    public final int f19785X;

    /* renamed from: Y, reason: collision with root package name */
    public final int f19786Y;

    /* renamed from: Z, reason: collision with root package name */
    public final int f19787Z;

    /* renamed from: b, reason: collision with root package name */
    public final int f19788b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19789c;

    /* renamed from: d, reason: collision with root package name */
    public final int f19790d;

    /* renamed from: e, reason: collision with root package name */
    public final int f19791e;

    /* renamed from: f, reason: collision with root package name */
    public final int f19792f;

    /* renamed from: g, reason: collision with root package name */
    public final int f19793g;

    /* renamed from: h, reason: collision with root package name */
    public final int f19794h;

    /* renamed from: i, reason: collision with root package name */
    public final int f19795i;

    /* renamed from: j, reason: collision with root package name */
    public final int f19796j;

    /* renamed from: k, reason: collision with root package name */
    public final int f19797k;

    /* renamed from: l, reason: collision with root package name */
    public final int f19798l;

    /* renamed from: m, reason: collision with root package name */
    public final int f19799m;

    /* renamed from: n, reason: collision with root package name */
    public final int f19800n;

    /* renamed from: o, reason: collision with root package name */
    public final int f19801o;

    /* renamed from: p, reason: collision with root package name */
    public final int f19802p;

    /* renamed from: q, reason: collision with root package name */
    public final int f19803q;

    /* renamed from: r, reason: collision with root package name */
    public final int f19804r;

    /* renamed from: s, reason: collision with root package name */
    public final int f19805s;

    /* renamed from: t, reason: collision with root package name */
    public final int f19806t;

    /* renamed from: u, reason: collision with root package name */
    public final int f19807u;

    /* renamed from: v, reason: collision with root package name */
    public final int f19808v;

    /* renamed from: w, reason: collision with root package name */
    public final int f19809w;

    /* renamed from: x, reason: collision with root package name */
    public final int f19810x;

    /* renamed from: y, reason: collision with root package name */
    public final int f19811y;

    /* renamed from: z, reason: collision with root package name */
    public final int f19812z;

    public d(int i12, @k Resources resources, @k com.avito.konveyor.a aVar) {
        this.f19788b = i12;
        this.f19789c = resources.getDimensionPixelOffset(R.dimen.root_top_offset);
        this.f19790d = resources.getDimensionPixelOffset(R.dimen.root_bottom_offset);
        this.f19791e = resources.getDimensionPixelOffset(R.dimen.root_default_offset);
        this.f19792f = resources.getDimensionPixelOffset(R.dimen.root_issue_to_title_offset);
        this.f19793g = resources.getDimensionPixelOffset(R.dimen.root_title_to_issue_offset);
        this.f19794h = resources.getDimensionPixelOffset(R.dimen.root_title_to_borrower_offset);
        this.f19795i = resources.getDimensionPixelOffset(R.dimen.root_borrower_to_action_offset);
        this.f19796j = resources.getDimensionPixelOffset(R.dimen.root_action_to_action_offset);
        this.f19797k = resources.getDimensionPixelOffset(R.dimen.root_action_to_borrower_offset);
        this.f19798l = resources.getDimensionPixelOffset(R.dimen.root_navigation_top_offset);
        this.f19799m = resources.getDimensionPixelOffset(R.dimen.root_team_default_top_offset);
        this.f19800n = resources.getDimensionPixelOffset(R.dimen.root_status_to_team_offset);
        this.f19801o = resources.getDimensionPixelOffset(R.dimen.root_support_top_offset);
        this.f19802p = resources.getDimensionPixelOffset(R.dimen.root_disclaimer_top_offset);
        this.f19803q = resources.getDimensionPixelOffset(R.dimen.root_privacy_top_offset);
        this.f19804r = resources.getDimensionPixelOffset(R.dimen.root_after_status_default_offset);
        this.f19805s = resources.getDimensionPixelOffset(R.dimen.root_status_to_title_offset);
        this.f19806t = resources.getDimensionPixelOffset(R.dimen.root_title_to_bank_tabs_offset);
        this.f19807u = resources.getDimensionPixelOffset(R.dimen.root_bank_to_team_offset);
        this.f19808v = resources.getDimensionPixelOffset(R.dimen.root_title_to_cta_banner_offset);
        this.f19809w = resources.getDimensionPixelOffset(R.dimen.root_cta_banner_to_cta_banner_offset);
        this.f19810x = resources.getDimensionPixelOffset(R.dimen.root_after_cta_banner_default_offset);
        this.f19811y = resources.getDimensionPixelOffset(R.dimen.root_before_info_banner_default_offset);
        this.f19812z = resources.getDimensionPixelOffset(R.dimen.root_after_info_banner_default_offset);
        this.f19762A = resources.getDimensionPixelOffset(R.dimen.root_after_comment_default_offset);
        this.f19763B = resources.getDimensionPixelOffset(R.dimen.root_after_bank_banner_default_offset);
        this.f19764C = resources.getDimensionPixelOffset(R.dimen.mortgage_root_before_mortgage_progress_offset);
        this.f19765D = resources.getDimensionPixelOffset(R.dimen.mortgage_root_before_realty_object_offset);
        this.f19766E = resources.getDimensionPixelOffset(R.dimen.root_after_realty_object_details_offset);
        this.f19767F = aVar.Y(com.avito.android.mortgage.root.list.items.issue.a.class);
        this.f19768G = aVar.Y(com.avito.android.mortgage.root.list.items.title.a.class);
        this.f19769H = aVar.Y(com.avito.android.mortgage.root.list.items.borrower_title.a.class);
        this.f19770I = aVar.Y(com.avito.android.mortgage.root.list.items.borrower_action.a.class);
        this.f19771J = aVar.Y(com.avito.android.mortgage.root.list.items.borrower_add.a.class);
        this.f19772K = aVar.Y(com.avito.android.mortgage.root.list.items.navigation.a.class);
        this.f19773L = aVar.Y(com.avito.android.mortgage.root.list.items.team.a.class);
        this.f19774M = aVar.Y(com.avito.android.mortgage.root.list.items.status.a.class);
        this.f19775N = aVar.Y(com.avito.android.mortgage.root.list.items.support.a.class);
        this.f19776O = aVar.Y(com.avito.android.mortgage.root.list.items.disclaimer.a.class);
        this.f19777P = aVar.Y(com.avito.android.mortgage.root.list.items.privacy.a.class);
        this.f19778Q = aVar.Y(com.avito.android.mortgage.root.list.items.legacy_status.a.class);
        this.f19779R = aVar.Y(com.avito.android.mortgage.root.list.items.bank_tabs.a.class);
        this.f19780S = aVar.Y(com.avito.android.mortgage.root.list.items.bank.a.class);
        this.f19781T = aVar.Y(com.avito.android.mortgage.root.list.items.bank_banner.a.class);
        this.f19782U = aVar.Y(com.avito.android.mortgage.root.list.items.cta_banner.a.class);
        this.f19783V = aVar.Y(com.avito.android.mortgage.root.list.items.credit_terms.a.class);
        this.f19784W = aVar.Y(com.avito.android.mortgage.root.list.items.comment.a.class);
        this.f19785X = aVar.Y(com.avito.android.mortgage.root.list.items.realty_object_details.c.class);
        this.f19786Y = aVar.Y(com.avito.android.mortgage.root.list.items.realty_object.a.class);
        this.f19787Z = aVar.Y(com.avito.android.mortgage.root.list.items.mortgage_progress.a.class);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        int i12;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter == null) {
            return;
        }
        RecyclerView.C cW2 = recyclerView.W(view);
        int iU2 = RecyclerView.U(view);
        Integer numValueOf = Integer.valueOf(iU2);
        if (iU2 == -1) {
            numValueOf = null;
        }
        if (numValueOf == null) {
            Rect rect2 = new Rect();
            RecyclerView.Y(view, rect2);
            rect.set(rect2);
            return;
        }
        if (numValueOf.intValue() == 0) {
            i12 = this.f19789c;
        } else {
            int itemViewType = adapter.getItemViewType(numValueOf.intValue() - 1);
            int itemViewType2 = cW2.getItemViewType();
            if (itemViewType == this.f19785X) {
                i12 = this.f19766E;
            } else {
                int i13 = this.f19767F;
                int i14 = this.f19768G;
                if (itemViewType == i14 && itemViewType2 == i13) {
                    i12 = this.f19793g;
                } else if (itemViewType == i13 && itemViewType2 == i14) {
                    i12 = this.f19792f;
                } else {
                    int i15 = this.f19770I;
                    int i16 = this.f19769H;
                    if (itemViewType == i16 && itemViewType2 == i15) {
                        i12 = this.f19795i;
                    } else if (itemViewType == i15 && itemViewType2 == i15) {
                        i12 = this.f19796j;
                    } else {
                        int i17 = this.f19797k;
                        if ((itemViewType == i15 && itemViewType2 == i16) || (itemViewType == i15 && itemViewType2 == this.f19771J)) {
                            i12 = i17;
                        } else {
                            int i18 = this.f19783V;
                            if (itemViewType == i18) {
                                i12 = this.f19812z;
                            } else if (itemViewType2 == i18) {
                                i12 = this.f19811y;
                            } else if (itemViewType2 == i16) {
                                i12 = this.f19794h;
                            } else if (itemViewType2 == this.f19772K) {
                                i12 = this.f19798l;
                            } else {
                                int i19 = this.f19774M;
                                int i22 = this.f19773L;
                                if (itemViewType == i19 && itemViewType2 == i22) {
                                    i12 = this.f19799m;
                                } else {
                                    int i23 = this.f19780S;
                                    if (itemViewType == i23 && itemViewType2 == i22) {
                                        i12 = this.f19807u;
                                    } else if (itemViewType2 == i22) {
                                        i12 = this.f19800n;
                                    } else if (itemViewType2 == this.f19775N) {
                                        i12 = this.f19801o;
                                    } else if (itemViewType2 == this.f19776O) {
                                        i12 = this.f19802p;
                                    } else if (itemViewType2 == this.f19777P) {
                                        i12 = this.f19803q;
                                    } else {
                                        int i24 = this.f19778Q;
                                        if (itemViewType == i24 && itemViewType2 == i14) {
                                            i12 = this.f19805s;
                                        } else if (itemViewType == i24) {
                                            i12 = this.f19804r;
                                        } else if (itemViewType == i14 && itemViewType2 == this.f19779R) {
                                            i12 = this.f19806t;
                                        } else {
                                            int i25 = this.f19782U;
                                            i12 = (itemViewType == i14 && itemViewType2 == i25) ? this.f19808v : (itemViewType == i25 && itemViewType2 == i25) ? this.f19809w : itemViewType == i25 ? this.f19810x : itemViewType == this.f19784W ? this.f19762A : itemViewType == this.f19781T ? this.f19763B : itemViewType2 == this.f19787Z ? this.f19764C : itemViewType2 == this.f19786Y ? this.f19765D : itemViewType2 == i23 ? 0 : this.f19791e;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        int i26 = numValueOf.intValue() == adapter.getItemCount() + (-1) ? this.f19790d : 0;
        int i27 = this.f19788b;
        rect.left = i27;
        rect.right = i27;
        rect.top = i12;
        rect.bottom = i26;
    }
}
