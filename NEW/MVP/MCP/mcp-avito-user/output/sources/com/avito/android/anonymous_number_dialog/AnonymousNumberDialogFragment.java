package com.avito.android.anonymous_number_dialog;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AnonymousNumberDialogFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/anonymous_number_dialog/AnonymousNumberDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_anonymous-number-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AnonymousNumberDialogFragment extends DialogFragment implements InterfaceC28477j.b {

    /* renamed from: f0, reason: collision with root package name */
    @Y61.k
    public static final a f91267f0 = new a(null);

    /* compiled from: AnonymousNumberDialogFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/anonymous_number_dialog/AnonymousNumberDialogFragment$a;", "", "<init>", "()V", "_avito_anonymous-number-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: AnonymousNumberDialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = AnonymousNumberDialogFragment.f91267f0;
            AnonymousNumberDialogFragment.this.b5(null);
            return G0.f406611a;
        }
    }

    public final void b5(DeepLink deepLink) {
        Bundle bundle;
        FragmentManager parentFragmentManager = getParentFragmentManager();
        String tag = getTag();
        if (tag == null) {
            tag = "";
        }
        if (deepLink != null) {
            bundle = new Bundle();
            bundle.putParcelable("AnonymousNumberDialogResult", deepLink);
        } else {
            bundle = Bundle.EMPTY;
        }
        parentFragmentManager.o0(bundle, tag);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(@Y61.k DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        b5(null);
    }

    @Override // androidx.fragment.app.DialogFragment
    @Y61.k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        Parcelable parcelable = requireArguments().getParcelable("anonymous_number_arguments");
        if (parcelable == null) {
            throw new IllegalArgumentException("arguments is null");
        }
        AnonymousNumberDialogArguments anonymousNumberDialogArguments = (AnonymousNumberDialogArguments) parcelable;
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(requireContext(), R.style.AnonymousNumberDialog);
        dVar.T();
        com.avito.android.lib.design.bottom_sheet.d.M(dVar, null, false, true, 7);
        dVar.S(C35835l0.g(dVar.getContext()).y);
        dVar.setCancelable(true);
        View viewInflate = LayoutInflater.from(dVar.getContext()).inflate(R.layout.anonymous_number_dialog, (ViewGroup) null);
        I5.a((TextView) viewInflate.findViewById(R.id.bottom_sheet_title), anonymousNumberDialogArguments.f91262b, false);
        dVar.G(viewInflate, true);
        TextView textView = (TextView) viewInflate.findViewById(R.id.bottom_sheet_content);
        I5.a(textView, anonymousNumberDialogArguments.f91263c, false);
        textView.setMovementMethod(new LinkMovementMethod());
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.title_image_view);
        String str = anonymousNumberDialogArguments.f91264d;
        D6.G(imageView, str != null);
        if (str != null) {
            str.equals("phone_behind_shield");
            imageView.setImageResource(R.drawable.ic_anonymous_number_dialog);
        }
        ((ImageView) viewInflate.findViewById(R.id.bottom_sheet_close_button)).setOnClickListener(new S7.a(dVar, 8));
        Button button = (Button) viewInflate.findViewById(R.id.phone_button);
        com.avito.android.lib.design.button.b.a(button, anonymousNumberDialogArguments.f91265e, false);
        button.setOnClickListener(new com.avito.android.advertising.adapter.items.buzzoola.media_x2.d(5, this, anonymousNumberDialogArguments));
        dVar.R(new b());
        return dVar;
    }
}
