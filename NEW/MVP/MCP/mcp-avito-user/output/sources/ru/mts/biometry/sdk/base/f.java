package ru.mts.biometry.sdk.base;

import A91.c;
import A91.d;
import B91.C13111d;
import H91.g;
import android.app.Dialog;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import ru.mts.biometry.sdk.view.SdkBioButton;

@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lru/mts/biometry/sdk/base/f;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "<init>", "()V", "ru/mts/biometry/sdk/base/c", "sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class f extends BottomSheetDialogFragment {

    /* renamed from: f0, reason: collision with root package name */
    public C13111d f436377f0;

    /* renamed from: g0, reason: collision with root package name */
    public Fragment f436378g0;

    /* renamed from: h0, reason: collision with root package name */
    public final InterfaceC42726C f436379h0 = C42727D.c(new d(this));

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, R.style.AppBottomSheetDialogTheme);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        return new c(requireContext(), getTheme());
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.sdk_bio_bottom_sheet_container, viewGroup, false);
        int i12 = R.id.btnClose;
        SdkBioButton sdkBioButton = (SdkBioButton) g2.d.a(viewInflate, R.id.btnClose);
        if (sdkBioButton != null) {
            i12 = R.id.btn_layout;
            LinearLayout linearLayout = (LinearLayout) g2.d.a(viewInflate, R.id.btn_layout);
            if (linearLayout != null) {
                i12 = R.id.fragment_container;
                NestedScrollView nestedScrollView = (NestedScrollView) g2.d.a(viewInflate, R.id.fragment_container);
                if (nestedScrollView != null) {
                    i12 = R.id.ic_close;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) g2.d.a(viewInflate, R.id.ic_close);
                    if (appCompatImageView != null) {
                        i12 = R.id.topHandle;
                        View viewA = g2.d.a(viewInflate, R.id.topHandle);
                        if (viewA != null) {
                            i12 = R.id.tv_bottom_sheet_title;
                            TextView textView = (TextView) g2.d.a(viewInflate, R.id.tv_bottom_sheet_title);
                            if (textView != null) {
                                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                this.f436377f0 = new C13111d(constraintLayout, sdkBioButton, linearLayout, nestedScrollView, appCompatImageView, viewA, textView);
                                return constraintLayout;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i12)));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f436377f0 = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C13111d c13111d = this.f436377f0;
        if (c13111d != null) {
            Dialog dialog = getDialog();
            if (dialog != null) {
                BottomSheetBehavior bottomSheetBehaviorB = BottomSheetBehavior.B(dialog.findViewById(com.google.android.material.R.id.design_bottom_sheet));
                bottomSheetBehaviorB.b(3);
                bottomSheetBehaviorB.f355973J = true;
            }
            TypedArray typedArrayObtainStyledAttributes = requireContext().getTheme().obtainStyledAttributes(new int[]{R.attr.sdkBioBottomSheetCloseButtonStyle});
            try {
                int i12 = typedArrayObtainStyledAttributes.getInt(0, 0);
                typedArrayObtainStyledAttributes.recycle();
                TextView textView = c13111d.f1103g;
                AppCompatImageView appCompatImageView = c13111d.f1101e;
                if (i12 == 1) {
                    LinearLayout linearLayout = c13111d.f1099c;
                    g.c(linearLayout);
                    final int i13 = 0;
                    c13111d.f1098b.setOnClickListener(new View.OnClickListener(this) { // from class: A91.e

                        /* renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ ru.mts.biometry.sdk.base.f f141c;

                        {
                            this.f141c = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            switch (i13) {
                                case 0:
                                    this.f141c.dismissAllowingStateLoss();
                                    break;
                                default:
                                    this.f141c.dismissAllowingStateLoss();
                                    break;
                            }
                        }
                    });
                    g.c(c13111d.f1102f);
                    g.b(appCompatImageView);
                    androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
                    int id2 = c13111d.f1100d.getId();
                    ConstraintLayout constraintLayout = c13111d.f1097a;
                    dVar.g(constraintLayout);
                    dVar.i(id2, 3, textView.getId(), 4);
                    dVar.i(id2, 6, 0, 6);
                    dVar.i(id2, 7, 0, 7);
                    dVar.i(id2, 4, linearLayout.getId(), 3);
                    dVar.c(constraintLayout);
                } else {
                    final int i14 = 1;
                    appCompatImageView.setOnClickListener(new View.OnClickListener(this) { // from class: A91.e

                        /* renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ ru.mts.biometry.sdk.base.f f141c;

                        {
                            this.f141c = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            switch (i14) {
                                case 0:
                                    this.f141c.dismissAllowingStateLoss();
                                    break;
                                default:
                                    this.f141c.dismissAllowingStateLoss();
                                    break;
                            }
                        }
                    });
                }
                textView.setText((String) this.f436379h0.getValue());
                Fragment fragment = this.f436378g0;
                if (fragment != null) {
                    H hE2 = getChildFragmentManager().e();
                    hE2.n(R.id.fragment_container, fragment, "content_tag");
                    hE2.e();
                }
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        }
    }
}
