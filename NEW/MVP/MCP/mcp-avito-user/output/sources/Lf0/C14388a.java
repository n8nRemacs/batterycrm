package Lf0;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import com.avito.android.remote.model.LimitsInfo;
import com.avito.android.util.I5;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PublishLimitsInfoView.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u0006J\u0017\u0010\f\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LLf0/a;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "text", "Lkotlin/G0;", "setTitle", "(Ljava/lang/String;)V", "setDescription", "setProgressHint", "setCategory", "setLocation", "", "setExtraInfo", "(Ljava/lang/CharSequence;)V", "_avito_publish-limits-info_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Lf0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C14388a extends ConstraintLayout {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f10075b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f10076c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f10077d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f10078e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f10079f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final TextView f10080g;

    /* compiled from: PublishLimitsInfoView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Lf0.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0625a {
        static {
            int[] iArr = new int[LimitsInfo.Progress.Style.values().length];
            try {
                iArr[LimitsInfo.Progress.Style.WARNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LimitsInfo.Progress.Style.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public C14388a(Context context, AttributeSet attributeSet, int i12, C42822w c42822w) {
        super(context, (i12 & 2) != 0 ? null : attributeSet);
        LayoutInflater.from(context).inflate(R.layout.publish_limits_info, (ViewGroup) this, true);
        this.f10075b = (TextView) findViewById(R.id.title);
        this.f10076c = (TextView) findViewById(R.id.description);
        this.f10077d = (TextView) findViewById(R.id.progress_hint);
        this.f10078e = (TextView) findViewById(R.id.category);
        this.f10079f = (TextView) findViewById(R.id.location);
        this.f10080g = (TextView) findViewById(R.id.extra_info);
    }

    public final void setCategory(@l String text) {
        I5.a(this.f10078e, text, false);
    }

    public final void setDescription(@l String text) {
        I5.a(this.f10076c, text, false);
    }

    public final void setExtraInfo(@l CharSequence text) {
        TextView textView = this.f10080g;
        I5.a(textView, text, false);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public final void setLocation(@l String text) {
        I5.a(this.f10079f, text, false);
    }

    public final void setProgressHint(@l String text) {
        I5.a(this.f10077d, text, false);
    }

    public final void setTitle(@l String text) {
        I5.a(this.f10075b, text, false);
    }
}
