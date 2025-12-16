package e11;

import android.widget.RelativeLayout;

/* renamed from: e11.y1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39923y1 extends RelativeLayout {

    /* renamed from: b, reason: collision with root package name */
    @j.P
    public String f394911b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    public a f394912c;

    /* renamed from: e11.y1$a */
    public interface a {
    }

    @j.P
    public String getTitle() {
        return this.f394911b;
    }

    public void setMainColor(int i12) {
        setBackgroundColor(i12);
    }

    public void setOnCloseClickListener(@j.P a aVar) {
        this.f394912c = aVar;
    }

    public void setStripeColor(int i12) {
        throw null;
    }

    public void setTitle(@j.P String str) {
        this.f394911b = str;
        throw null;
    }

    public void setTitleColor(int i12) {
        throw null;
    }
}
