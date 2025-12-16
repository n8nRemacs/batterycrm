package androidx.view.dynamicfeatures.fragment.ui;

import Ba.ViewOnClickListenerC13121a;
import Y61.k;
import Y61.l;
import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;

/* compiled from: DefaultProgressFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/navigation/dynamicfeatures/fragment/ui/DefaultProgressFragment;", "Landroidx/navigation/dynamicfeatures/fragment/ui/AbstractProgressFragment;", "<init>", "()V", "a", "navigation-dynamic-features-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DefaultProgressFragment extends AbstractProgressFragment {

    /* renamed from: o0, reason: collision with root package name */
    public static final /* synthetic */ int f53072o0 = 0;

    /* renamed from: l0, reason: collision with root package name */
    @l
    public TextView f53073l0;

    /* renamed from: m0, reason: collision with root package name */
    @l
    public ProgressBar f53074m0;

    /* renamed from: n0, reason: collision with root package name */
    @l
    public Button f53075n0;

    /* compiled from: DefaultProgressFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/navigation/dynamicfeatures/fragment/ui/DefaultProgressFragment$a;", "", "<init>", "()V", "", "PROGRESS_MAX", "I", "", "TAG", "Ljava/lang/String;", "navigation-dynamic-features-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: DefaultProgressFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class b extends N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            DefaultProgressFragment.this.b5();
            return G0.f406611a;
        }
    }

    static {
        new a(null);
    }

    public DefaultProgressFragment() {
        super(0);
    }

    @Override // androidx.view.dynamicfeatures.fragment.ui.AbstractProgressFragment
    public final void c5() {
        TextView textView = this.f53073l0;
        if (textView != null) {
            textView.setText(R.string.installation_cancelled);
        }
        ProgressBar progressBar = this.f53074m0;
        if (progressBar != null) {
            progressBar.setVisibility(4);
        }
        b bVar = new b();
        Button button = this.f53075n0;
        if (button != null) {
            button.setText(R.string.retry);
            button.setOnClickListener(new ViewOnClickListenerC13121a(5, bVar));
            button.setVisibility(0);
        }
    }

    @Override // androidx.view.dynamicfeatures.fragment.ui.AbstractProgressFragment
    public final void d5() {
        TextView textView = this.f53073l0;
        if (textView != null) {
            textView.setText(R.string.installation_failed);
        }
        ProgressBar progressBar = this.f53074m0;
        if (progressBar != null) {
            progressBar.setVisibility(4);
        }
        androidx.view.dynamicfeatures.fragment.ui.a aVar = new androidx.view.dynamicfeatures.fragment.ui.a(this);
        Button button = this.f53075n0;
        if (button != null) {
            button.setText(R.string.ok);
            button.setOnClickListener(new ViewOnClickListenerC13121a(5, aVar));
            button.setVisibility(0);
        }
    }

    @Override // androidx.view.dynamicfeatures.fragment.ui.AbstractProgressFragment
    public final void e5(long j12, long j13) {
        ProgressBar progressBar = this.f53074m0;
        if (progressBar != null) {
            progressBar.setVisibility(0);
            if (j13 == 0) {
                progressBar.setIndeterminate(true);
            } else {
                progressBar.setProgress((int) ((100 * j12) / j13));
                progressBar.setIndeterminate(false);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f53073l0 = null;
        this.f53074m0 = null;
        this.f53075n0 = null;
    }

    @Override // androidx.view.dynamicfeatures.fragment.ui.AbstractProgressFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @l Bundle bundle) throws PackageManager.NameNotFoundException {
        Drawable defaultActivityIcon;
        super.onViewCreated(view, bundle);
        this.f53073l0 = (TextView) view.findViewById(R.id.progress_title);
        this.f53074m0 = (ProgressBar) view.findViewById(R.id.installation_progress);
        ImageView imageView = (ImageView) view.findViewById(R.id.progress_icon);
        PackageManager packageManager = requireContext().getPackageManager();
        try {
            defaultActivityIcon = packageManager.getActivityIcon(new ComponentName(requireContext(), requireActivity().getClass()));
        } catch (PackageManager.NameNotFoundException unused) {
            defaultActivityIcon = packageManager.getDefaultActivityIcon();
        }
        imageView.setImageDrawable(defaultActivityIcon);
        this.f53075n0 = (Button) view.findViewById(R.id.progress_action);
    }
}
