package IH;

import Y61.k;
import android.app.Application;
import android.content.res.Resources;
import com.avito.android.deep_linking.x;
import com.avito.android.gig_snippet.models.GigShiftsWidgetSlotHeader;
import com.avito.android.gig_snippet.models.GigShiftsWidgetSlotTimer;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: GigSnippetItemConverterImpl.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIH/d;", "Lcom/avito/android/gig_snippet/f;", "_avito_gig_snippet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d implements com.avito.android.gig_snippet.f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final IH.a f8068a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final x f8069b;

    /* renamed from: c, reason: collision with root package name */
    public final Resources f8070c;

    /* compiled from: GigSnippetItemConverterImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8071a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f8072b;

        static {
            int[] iArr = new int[GigShiftsWidgetSlotTimer.Direction.values().length];
            try {
                iArr[GigShiftsWidgetSlotTimer.Direction.AfterStart.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GigShiftsWidgetSlotTimer.Direction.UntilStart.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GigShiftsWidgetSlotTimer.Direction.UntilFinished.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f8071a = iArr;
            int[] iArr2 = new int[GigShiftsWidgetSlotHeader.TitleColor.values().length];
            try {
                iArr2[GigShiftsWidgetSlotHeader.TitleColor.Red.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[GigShiftsWidgetSlotHeader.TitleColor.Green.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[GigShiftsWidgetSlotHeader.TitleColor.Black.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f8072b = iArr2;
        }
    }

    @Inject
    public d(@k IH.a aVar, @k x xVar, @k Application application) {
        this.f8068a = aVar;
        this.f8069b = xVar;
        this.f8070c = application.getResources();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00c8  */
    @Override // com.avito.android.gig_snippet.f
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.gig_snippet.list.snippet.GigShiftSnippetItem a(@Y61.k com.avito.android.gig_snippet.models.GigShiftsWidgetItem r32) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: IH.d.a(com.avito.android.gig_snippet.models.GigShiftsWidgetItem):com.avito.android.gig_snippet.list.snippet.GigShiftSnippetItem");
    }
}
