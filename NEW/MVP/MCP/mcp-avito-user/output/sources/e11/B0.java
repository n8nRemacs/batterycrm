package e11;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes7.dex */
public class B0 extends RelativeLayout {

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final RelativeLayout f394274b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    public final ImageView f394275c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    public final ImageView f394276d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    public final C39924z f394277e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f394278f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    public final b f394279g;

    public static class b implements View.OnClickListener {

        /* renamed from: b, reason: collision with root package name */
        @j.N
        public final Context f394280b;

        public b(Context context, a aVar) {
            this.f394280b = context;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Context context = this.f394280b;
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://target.my.com/"));
                if (!(context instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                context.startActivity(intent);
            } catch (Throwable th2) {
                th2.getMessage();
            }
        }
    }

    public B0(@j.N Context context, @j.N C39924z c39924z, boolean z12) {
        super(context);
        this.f394274b = new RelativeLayout(context);
        ImageView imageView = new ImageView(context);
        this.f394275c = imageView;
        C39924z.m(imageView, "logo_image");
        ImageView imageView2 = new ImageView(context);
        this.f394276d = imageView2;
        C39924z.m(imageView2, "store_image");
        this.f394277e = c39924z;
        this.f394278f = z12;
        this.f394279g = new b(context, null);
    }
}
