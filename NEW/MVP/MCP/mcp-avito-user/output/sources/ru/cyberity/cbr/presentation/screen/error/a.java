package ru.cyberity.cbr.presentation.screen.error;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import e11.ViewOnClickListenerC39879j1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import ru.cyberity.internal.R;

/* compiled from: CBRErrorDialog.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lru/cyberity/cbr/presentation/screen/error/a;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "Lkotlin/G0;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "a", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class a extends BottomSheetDialogFragment {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: c, reason: collision with root package name */
    @k
    private static final String f434677c = "arg_message";

    /* renamed from: d, reason: collision with root package name */
    @k
    private static final String f434678d = "arg_button";

    /* compiled from: CBRErrorDialog.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0006\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082D¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082D¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\u000e"}, d2 = {"Lru/cyberity/cbr/presentation/screen/error/a$a;", "", "", "message", "buttonText", "Lru/cyberity/cbr/presentation/screen/error/a;", "a", "", "ARG_BUTTON", "Ljava/lang/String;", "ARG_MESSAGE", "TAG", "<init>", "()V", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.presentation.screen.error.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public final a a(@l CharSequence message, @l CharSequence buttonText) {
            a aVar = new a();
            Bundle bundle = new Bundle();
            bundle.putCharSequence(a.f434677c, message);
            bundle.putCharSequence(a.f434678d, buttonText);
            aVar.setArguments(bundle);
            return aVar;
        }

        private Companion() {
        }
    }

    @Override // androidx.fragment.app.Fragment
    @l
    public View onCreateView(@k LayoutInflater inflater, @l ViewGroup container, @l Bundle savedInstanceState) {
        return inflater.inflate(R.layout.cbr_fragment_error_dialog, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@k View view, @l Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView textView = (TextView) view.findViewById(R.id.cbr_text);
        if (textView != null) {
            Bundle arguments = getArguments();
            textView.setText(arguments != null ? arguments.getCharSequence(f434677c) : null);
        }
        Button button = (Button) view.findViewById(R.id.cbr_button);
        if (button != null) {
            Bundle arguments2 = getArguments();
            button.setText(arguments2 != null ? arguments2.getCharSequence(f434678d) : null);
            button.setOnClickListener(new ViewOnClickListenerC39879j1(this, 26));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(a aVar, View view) {
        aVar.dismiss();
    }
}
