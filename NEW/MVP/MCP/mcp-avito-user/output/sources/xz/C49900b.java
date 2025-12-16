package xZ;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: MnzContentPlaceholder.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LxZ/b;", "Landroid/widget/FrameLayout;", "_avito_mnz-common_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: xZ.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C49900b extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final LinearLayout f442533b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final TextView f442534c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final TextView f442535d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final View f442536e;

    public /* synthetic */ C49900b(Context context, View view, View.OnClickListener onClickListener, int i12, C42822w c42822w) {
        this(context, (i12 & 2) != 0 ? null : view, (i12 & 4) != 0 ? null : onClickListener);
    }

    @j
    public C49900b(@k Context context, @l View view, @l View.OnClickListener onClickListener) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.mnz_network_problem_view, (ViewGroup) this, true);
        this.f442533b = (LinearLayout) findViewById(R.id.mnz_network_problem_container);
        this.f442534c = (TextView) findViewById(R.id.mnz_network_problem_error_title);
        this.f442535d = (TextView) findViewById(R.id.mnz_network_problem_error_text);
        this.f442536e = view;
        Button button = (Button) findViewById(R.id.mnz_network_problem_retry_button);
        if (button != null) {
            button.setOnClickListener(onClickListener);
        }
    }
}
