package com.avito.android.work_profile.profile.gig.ui.list.button_item;

import Y61.k;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.work_profile.profile.gig.ui.list.button_item.GigButtonItem;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: GigButtonItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/work_profile/profile/gig/ui/list/button_item/c;", "LTV0/e;", "Lcom/avito/konveyor/adapter/b;", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c extends com.avito.konveyor.adapter.b implements TV0.e {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f331214j = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Context f331215b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f331216c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f331217d;

    /* renamed from: e, reason: collision with root package name */
    public final Button f331218e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f331219f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f331220g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f331221h;

    /* renamed from: i, reason: collision with root package name */
    public final ImageView f331222i;

    /* compiled from: GigButtonItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f331223a;

        static {
            int[] iArr = new int[GigButtonItem.Status.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                GigButtonItem.Status status = GigButtonItem.Status.f331202b;
                iArr[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                GigButtonItem.Status status2 = GigButtonItem.Status.f331202b;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                GigButtonItem.Status status3 = GigButtonItem.Status.f331202b;
                iArr[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                GigButtonItem.Status status4 = GigButtonItem.Status.f331202b;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                GigButtonItem.Status status5 = GigButtonItem.Status.f331202b;
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f331223a = iArr;
            int[] iArr2 = new int[GigButtonItem.IconType.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                GigButtonItem.IconType iconType = GigButtonItem.IconType.f331198b;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public c(@k View view) {
        super(view);
        this.f331215b = view.getContext();
        this.f331216c = (ViewGroup) view.findViewById(R.id.button_root);
        this.f331217d = (ImageView) view.findViewById(R.id.button_icon);
        this.f331218e = (Button) view.findViewById(R.id.button);
        this.f331219f = (TextView) view.findViewById(R.id.title);
        this.f331220g = (TextView) view.findViewById(R.id.subtitle);
        this.f331221h = (TextView) view.findViewById(R.id.trailing_text);
        this.f331222i = (ImageView) view.findViewById(R.id.click_marker);
    }

    public final void B80(int i12) {
        this.f331218e.setIconColor(ColorStateList.valueOf(this.itemView.getContext().getColor(i12)));
    }

    public final void C80(int i12) {
        this.f331220g.setTextColor(this.itemView.getContext().getColor(i12));
    }
}
