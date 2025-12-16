package com.avito.android.autoteka.presentation.previewsearch.mvi.mapper;

import Y61.k;
import com.avito.android.R;
import com.avito.android.autoteka.items.fullScreenError.previewsearch.ButtonData;
import com.avito.android.autoteka.items.fullScreenError.previewsearch.PreviewSearchFullScreenErrorItem;
import com.avito.android.autoteka.presentation.previewsearch.mvi.entity.AutotekaPreviewSearchAction;
import com.avito.android.autoteka.presentation.previewsearch.mvi.entity.AutotekaPreviewSearchInternalAction;
import com.avito.android.remote.autoteka.model.AutotekaPreviewStatus;
import java.io.Serializable;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AutotekaPreviewSearchResultMapper.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/autoteka/presentation/previewsearch/mvi/mapper/a;", "", "<init>", "()V", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC42726C f97666a = C42727D.c(b.f97669l);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC42726C f97667b = C42727D.c(c.f97670l);

    /* compiled from: AutotekaPreviewSearchResultMapper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.autoteka.presentation.previewsearch.mvi.mapper.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C2917a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f97668a;

        static {
            int[] iArr = new int[AutotekaPreviewStatus.values().length];
            try {
                iArr[AutotekaPreviewStatus.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AutotekaPreviewStatus.AUTO_NOT_FOUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AutotekaPreviewStatus.REPORT_NOT_FOUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AutotekaPreviewStatus.PENDING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f97668a = iArr;
        }
    }

    /* compiled from: AutotekaPreviewSearchResultMapper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchInternalAction$InfoMessage;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<AutotekaPreviewSearchInternalAction.InfoMessage> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f97669l = new b();

        public b() {
            super(0);
        }

        @Override // Y41.a
        public final AutotekaPreviewSearchInternalAction.InfoMessage invoke() {
            return new AutotekaPreviewSearchInternalAction.InfoMessage(new PreviewSearchFullScreenErrorItem(null, com.avito.android.printable_text.b.c(R.string.autoteka_preview_search_vin_not_found_title, new Serializable[0]), com.avito.android.printable_text.b.c(R.string.autoteka_preview_search_vin_not_found_subtitle, new Serializable[0]), Integer.valueOf(R.drawable.vin_not_found), new ButtonData(com.avito.android.printable_text.b.c(R.string.autoteka_open_instruction_dialog_button_text, new Serializable[0]), AutotekaPreviewSearchAction.ShowInstructionDialog.f97616b), 1, null));
        }
    }

    /* compiled from: AutotekaPreviewSearchResultMapper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchInternalAction$InfoMessage;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<AutotekaPreviewSearchInternalAction.InfoMessage> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f97670l = new c();

        public c() {
            super(0);
        }

        @Override // Y41.a
        public final AutotekaPreviewSearchInternalAction.InfoMessage invoke() {
            return new AutotekaPreviewSearchInternalAction.InfoMessage(new PreviewSearchFullScreenErrorItem(null, com.avito.android.printable_text.b.c(R.string.autoteka_preview_search_report_not_found_title, new Serializable[0]), com.avito.android.printable_text.b.c(R.string.autoteka_preview_search_report_not_found_subtitle, new Serializable[0]), Integer.valueOf(R.drawable.report_not_found), null, 17, null));
        }
    }
}
