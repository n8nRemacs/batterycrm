package com.avito.android.video_picker.ui.item.video_card;

import Y41.l;
import Y61.k;
import android.content.ContentUris;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.provider.MediaStore;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.util.V2;
import com.avito.android.util.y6;
import com.avito.android.verification.verification_input_inn.o;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;

/* compiled from: VideoCardView.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/video_picker/ui/item/video_card/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/video_picker/ui/item/video_card/f;", "a", "_avito_video-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f325993g = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ViewGroup f325994b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC42726C f325995c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC42726C f325996d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC42726C f325997e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final InterfaceC42726C f325998f;

    /* compiled from: VideoCardView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/video_picker/ui/item/video_card/g$a;", "", "<init>", "()V", "", "DEFAULT_VIDEO_ITEM_MAX_DURATION_SEC", "J", "DEFAULT_VIDEO_ITEM_MAX_SIZE_MB", "DEFAULT_VIDEO_ITEM_MIN_DURATION_SEC", "_avito_video-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: VideoCardView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<TextView> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final TextView invoke() {
            return (TextView) g.this.f325994b.findViewById(R.id.duration);
        }
    }

    /* compiled from: VideoCardView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<View> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final View invoke() {
            return g.this.f325994b.findViewById(R.id.video_shading);
        }
    }

    /* compiled from: VideoCardView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.a<ImageView> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final ImageView invoke() {
            return (ImageView) g.this.f325994b.findViewById(R.id.video_thumbnail);
        }
    }

    /* compiled from: VideoCardView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e extends N implements Y41.a<TextView> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final TextView invoke() {
            return (TextView) g.this.f325994b.findViewById(R.id.warning_badge);
        }
    }

    static {
        new a(null);
    }

    public g(@k View view) {
        super(view);
        this.f325994b = (ViewGroup) view;
        this.f325995c = C42727D.c(new d());
        this.f325996d = C42727D.c(new b());
        this.f325997e = C42727D.c(new e());
        this.f325998f = C42727D.c(new c());
    }

    @Override // com.avito.android.video_picker.ui.item.video_card.f
    public final void AN(@k com.avito.android.video_picker.ui.item.video_card.c cVar, @k l<? super Uri, G0> lVar) {
        ViewGroup viewGroup = this.f325994b;
        Uri.Builder builderBuildUpon = MediaStore.Video.Media.getContentUri("external").buildUpon();
        String str = cVar.f325985b;
        Uri uriBuild = ContentUris.appendId(builderBuildUpon, Long.parseLong(str)).build();
        try {
            ((ImageView) this.f325995c.getValue()).setImageBitmap(Build.VERSION.SDK_INT >= 29 ? viewGroup.getContext().getContentResolver().loadThumbnail(uriBuild, new Size(y6.b(157), y6.b(220)), new CancellationSignal()) : MediaStore.Video.Thumbnails.getThumbnail(viewGroup.getContext().getContentResolver(), Long.parseLong(str), 1, null));
        } catch (Exception e12) {
            V2.f318762a.f(e12);
        }
        float f12 = cVar.f325987d / 1048576;
        Long l12 = cVar.f325988e;
        long jLongValue = l12 != null ? l12.longValue() : 600L;
        Long l13 = cVar.f325989f;
        long jLongValue2 = l13 != null ? l13.longValue() : 5L;
        Long l14 = cVar.f325990g;
        long jLongValue3 = l14 != null ? l14.longValue() : 500L;
        long j12 = cVar.f325986c;
        ((TextView) this.f325996d.getValue()).setText(new SimpleDateFormat("mm:ss", Locale.US).format(new Date(j12)));
        float f13 = j12 / 1000;
        float f14 = jLongValue;
        InterfaceC42726C interfaceC42726C = this.f325997e;
        if (f13 > f14) {
            B80();
            ((TextView) interfaceC42726C.getValue()).setText(this.itemView.getContext().getString(R.string.video_picker_warning_badge_video_is_to__long_res_0x7f13194d, Long.valueOf(jLongValue / 60)));
            return;
        }
        if (f12 > jLongValue3) {
            B80();
            ((TextView) interfaceC42726C.getValue()).setText(this.itemView.getContext().getString(R.string.video_picker_warning_badge_video_is_to__large_res_0x7f13194c, Long.valueOf(jLongValue3)));
        } else if (f13 < jLongValue2) {
            B80();
            ((TextView) interfaceC42726C.getValue()).setText(this.itemView.getContext().getString(R.string.video_picker_warning_badge_video_is_to__short_res_0x7f13194e, Long.valueOf(jLongValue2)));
        } else {
            viewGroup.setOnClickListener(new o(2, lVar, uriBuild));
            ((View) this.f325998f.getValue()).setVisibility(8);
            ((TextView) interfaceC42726C.getValue()).setVisibility(8);
        }
    }

    public final void B80() {
        ((View) this.f325998f.getValue()).setVisibility(0);
        ((TextView) this.f325997e.getValue()).setVisibility(0);
        this.f325994b.setOnClickListener(null);
    }
}
