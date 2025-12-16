package com.avito.android.service_booking_common.blueprints.geo_reference;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SbGeoReferenceViewHolder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_common/blueprints/geo_reference/h;", "Lcom/avito/konveyor/adapter/b;", "LTV0/e;", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h extends com.avito.konveyor.adapter.b implements TV0.e {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f276419e = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC42726C f276420b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC42726C f276421c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC42726C f276422d;

    /* compiled from: SbGeoReferenceViewHolder.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<TextView> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ View f276423l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(0);
            this.f276423l = view;
        }

        @Override // Y41.a
        public final TextView invoke() {
            View viewFindViewById = this.f276423l.findViewById(R.id.sb_geo_ref_map_link);
            if (viewFindViewById != null) {
                return (TextView) viewFindViewById;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
    }

    /* compiled from: SbGeoReferenceViewHolder.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<TextView> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ View f276424l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view) {
            super(0);
            this.f276424l = view;
        }

        @Override // Y41.a
        public final TextView invoke() {
            View viewFindViewById = this.f276424l.findViewById(R.id.sb_geo_ref_text);
            if (viewFindViewById != null) {
                return (TextView) viewFindViewById;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
    }

    /* compiled from: SbGeoReferenceViewHolder.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<TextView> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ View f276425l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(View view) {
            super(0);
            this.f276425l = view;
        }

        @Override // Y41.a
        public final TextView invoke() {
            View viewFindViewById = this.f276425l.findViewById(R.id.sb_geo_ref_title);
            if (viewFindViewById != null) {
                return (TextView) viewFindViewById;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
    }

    public h(@k View view) {
        super(view);
        this.f276420b = C42727D.c(new c(view));
        this.f276421c = C42727D.c(new b(view));
        this.f276422d = C42727D.c(new a(view));
    }
}
