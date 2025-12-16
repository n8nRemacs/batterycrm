package com.avito.android.verification.verification_disclaimer;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.verification.verification_disclaimer.VerificationDisclaimerScreenData;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import xM0.C49864d;

/* compiled from: VerificationDisclaimerView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/verification_disclaimer/m;", "", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.d f325073a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f325074b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final NavBar f325075c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f325076d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f325077e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f325078f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Button f325079g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final C49864d f325080h;

    /* compiled from: VerificationDisclaimerView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[VerificationDisclaimerScreenData.Button.Style.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                VerificationDisclaimerScreenData.Button.Style style = VerificationDisclaimerScreenData.Button.Style.f325045b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                VerificationDisclaimerScreenData.Button.Style style2 = VerificationDisclaimerScreenData.Button.Style.f325045b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: VerificationDisclaimerView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<View> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ View f325081l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view) {
            super(0);
            this.f325081l = view;
        }

        @Override // Y41.a
        public final View invoke() {
            return this.f325081l.findViewById(R.id.verification_disclaimer_content_container);
        }
    }

    public m(@Y61.k View view, @Y61.k com.avito.konveyor.adapter.d dVar) {
        this.f325073a = dVar;
        this.f325074b = view.getContext();
        this.f325075c = (NavBar) view.findViewById(R.id.verification_disclaimer_nav_bar);
        this.f325076d = (SimpleDraweeView) view.findViewById(R.id.verification_disclaimer_image);
        this.f325077e = (TextView) view.findViewById(R.id.verification_disclaimer_footer);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.verification_disclaimer_list);
        this.f325078f = recyclerView;
        this.f325079g = (Button) view.findViewById(R.id.verification_disclaimer_button);
        this.f325080h = new C49864d((ViewGroup) view.findViewById(R.id.verification_disclaimer_progress_root), new b(view), 0, 4, null);
        recyclerView.setAdapter(dVar);
        recyclerView.l(new MM0.b(), -1);
        recyclerView.l(new MM0.a(), -1);
    }
}
