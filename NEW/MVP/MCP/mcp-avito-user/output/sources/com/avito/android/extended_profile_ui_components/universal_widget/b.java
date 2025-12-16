package com.avito.android.extended_profile_ui_components.universal_widget;

import Y61.k;
import com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetBlockView;
import com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: UniversalWidgetBlockStateConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/extended_profile_ui_components/universal_widget/b;", "Lcom/avito/android/extended_profile_ui_components/universal_widget/a;", "a", "b", "c", "_avito_extended-profile-ui-components_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b implements com.avito.android.extended_profile_ui_components.universal_widget.a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f153640a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f153641b;

    /* renamed from: c, reason: collision with root package name */
    public final int f153642c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f153643d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final c f153644e;

    /* compiled from: UniversalWidgetBlockStateConverter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_ui_components/universal_widget/b$a;", "Lcom/avito/android/extended_profile_ui_components/universal_widget/b$c;", "<init>", "()V", "_avito_extended-profile-ui-components_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements c {

        /* compiled from: UniversalWidgetBlockStateConverter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.extended_profile_ui_components.universal_widget.b$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C4478a {
            static {
                int[] iArr = new int[UniversalWidgetBlockView.LayoutState.TextPosition.values().length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    UniversalWidgetBlockView.LayoutState.TextPosition textPosition = UniversalWidgetBlockView.LayoutState.TextPosition.f153496b;
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x001f  */
        @Override // com.avito.android.extended_profile_ui_components.universal_widget.b.c
        @Y61.k
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetBlockView.TextPaddings a(@Y61.k com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel.Section r5, @Y61.k com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel.Block r6, @Y61.k com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetBlockView.LayoutState.TextPosition r7) {
            /*
                r4 = this;
                int r0 = r7.ordinal()
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L2a
                if (r0 != r1) goto L24
                boolean r0 = r6 instanceof com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel.ImageWithTextBlock
                if (r0 == 0) goto L1f
                com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel$ImageWithTextBlock r6 = (com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel.ImageWithTextBlock) r6
                com.avito.android.remote.model.Image r0 = r6.f153571j
                if (r0 != 0) goto L18
                android.net.Uri r6 = r6.f153574m
                if (r6 == 0) goto L1f
            L18:
                r6 = 14
                int r6 = com.avito.android.util.y6.b(r6)
                goto L30
            L1f:
                int r6 = com.avito.android.util.y6.b(r2)
                goto L30
            L24:
                kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
                r5.<init>()
                throw r5
            L2a:
                r6 = 16
                int r6 = com.avito.android.util.y6.b(r6)
            L30:
                int r0 = r7.ordinal()
                if (r0 == 0) goto L44
                if (r0 != r1) goto L3e
                r0 = 6
                int r0 = com.avito.android.util.y6.b(r0)
                goto L4a
            L3e:
                kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
                r5.<init>()
                throw r5
            L44:
                r0 = 20
                int r0 = com.avito.android.util.y6.b(r0)
            L4a:
                boolean r1 = r5 instanceof com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel.FactoidSection
                r3 = 24
                if (r1 == 0) goto L55
                int r5 = com.avito.android.util.y6.b(r3)
                goto L6f
            L55:
                boolean r1 = r5 instanceof com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel.TextSection
                if (r1 == 0) goto L5e
                int r5 = com.avito.android.util.y6.b(r2)
                goto L6f
            L5e:
                boolean r5 = r5 instanceof com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel.ImageWithTextSection
                if (r5 == 0) goto L75
                com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetBlockView$LayoutState$TextPosition r5 = com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetBlockView.LayoutState.TextPosition.f153496b
                if (r7 != r5) goto L6b
                int r5 = com.avito.android.util.y6.b(r3)
                goto L6f
            L6b:
                int r5 = com.avito.android.util.y6.b(r2)
            L6f:
                com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetBlockView$TextPaddings r7 = new com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetBlockView$TextPaddings
                r7.<init>(r6, r0, r5)
                return r7
            L75:
                kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
                r5.<init>()
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.extended_profile_ui_components.universal_widget.b.a.a(com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel$Section, com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel$Block, com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetBlockView$LayoutState$TextPosition):com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetBlockView$TextPaddings");
        }
    }

    /* compiled from: UniversalWidgetBlockStateConverter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_ui_components/universal_widget/b$b;", "Lcom/avito/android/extended_profile_ui_components/universal_widget/b$c;", "<init>", "()V", "_avito_extended-profile-ui-components_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.extended_profile_ui_components.universal_widget.b$b, reason: collision with other inner class name */
    public static final class C4479b implements c {

        /* compiled from: UniversalWidgetBlockStateConverter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.extended_profile_ui_components.universal_widget.b$b$a */
        public /* synthetic */ class a {
            static {
                int[] iArr = new int[UniversalWidgetBlockView.LayoutState.TextPosition.values().length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    UniversalWidgetBlockView.LayoutState.TextPosition textPosition = UniversalWidgetBlockView.LayoutState.TextPosition.f153496b;
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
        @Override // com.avito.android.extended_profile_ui_components.universal_widget.b.c
        @Y61.k
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetBlockView.TextPaddings a(@Y61.k com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel.Section r7, @Y61.k com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel.Block r8, @Y61.k com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetBlockView.LayoutState.TextPosition r9) {
            /*
                r6 = this;
                boolean r0 = r7 instanceof com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel.FactoidSection
                r1 = 20
                r2 = 24
                if (r0 == 0) goto L25
                r3 = r7
                com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel$FactoidSection r3 = (com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel.FactoidSection) r3
                com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel$FactoidItemsCountType r4 = com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel.FactoidItemsCountType.f153553b
                com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel$FactoidItemsCountType r3 = r3.f153557c
                if (r3 != r4) goto L25
                com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetBlockView$TextPaddings r7 = new com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetBlockView$TextPaddings
                int r8 = com.avito.android.util.y6.b(r1)
                int r9 = com.avito.android.util.y6.b(r2)
                r0 = 28
                int r0 = com.avito.android.util.y6.b(r0)
                r7.<init>(r8, r9, r0)
                return r7
            L25:
                int r3 = r9.ordinal()
                r4 = 0
                r5 = 1
                if (r3 == 0) goto L53
                if (r3 != r5) goto L4d
                boolean r3 = r8 instanceof com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel.ImageWithTextBlock
                if (r3 == 0) goto L48
                com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel$ImageWithTextBlock r8 = (com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel.ImageWithTextBlock) r8
                com.avito.android.remote.model.Image r3 = r8.f153571j
                if (r3 != 0) goto L41
                android.net.Uri r3 = r8.f153574m
                if (r3 != 0) goto L41
                android.net.Uri r8 = r8.f153582u
                if (r8 == 0) goto L48
            L41:
                r8 = 14
                int r8 = com.avito.android.util.y6.b(r8)
                goto L59
            L48:
                int r8 = com.avito.android.util.y6.b(r4)
                goto L59
            L4d:
                kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
                r7.<init>()
                throw r7
            L53:
                r8 = 16
                int r8 = com.avito.android.util.y6.b(r8)
            L59:
                int r9 = r9.ordinal()
                if (r9 == 0) goto L6d
                if (r9 != r5) goto L67
                r9 = 6
                int r9 = com.avito.android.util.y6.b(r9)
                goto L71
            L67:
                kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
                r7.<init>()
                throw r7
            L6d:
                int r9 = com.avito.android.util.y6.b(r1)
            L71:
                if (r0 == 0) goto L78
                int r7 = com.avito.android.util.y6.b(r2)
                goto L89
            L78:
                boolean r0 = r7 instanceof com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel.TextSection
                if (r0 == 0) goto L81
                int r7 = com.avito.android.util.y6.b(r4)
                goto L89
            L81:
                boolean r7 = r7 instanceof com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel.ImageWithTextSection
                if (r7 == 0) goto L8f
                int r7 = com.avito.android.util.y6.b(r2)
            L89:
                com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetBlockView$TextPaddings r0 = new com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetBlockView$TextPaddings
                r0.<init>(r8, r9, r7)
                return r0
            L8f:
                kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
                r7.<init>()
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.extended_profile_ui_components.universal_widget.b.C4479b.a(com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel$Section, com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel$Block, com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetBlockView$LayoutState$TextPosition):com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetBlockView$TextPaddings");
        }
    }

    /* compiled from: UniversalWidgetBlockStateConverter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_ui_components/universal_widget/b$c;", "", "_avito_extended-profile-ui-components_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface c {
        @k
        UniversalWidgetBlockView.TextPaddings a(@k UniversalWidgetSectionModel.Section section, @k UniversalWidgetSectionModel.Block block, @k UniversalWidgetBlockView.LayoutState.TextPosition textPosition);
    }

    /* compiled from: UniversalWidgetBlockStateConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f153645a;

        static {
            int[] iArr = new int[UniversalWidgetSectionModel.FactoidItemsCountType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                UniversalWidgetSectionModel.FactoidItemsCountType factoidItemsCountType = UniversalWidgetSectionModel.FactoidItemsCountType.f153553b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[UniversalWidgetSectionModel.TextTitlePosition.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                UniversalWidgetSectionModel.TextTitlePosition textTitlePosition = UniversalWidgetSectionModel.TextTitlePosition.f153630b;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                UniversalWidgetSectionModel.TextTitlePosition textTitlePosition2 = UniversalWidgetSectionModel.TextTitlePosition.f153630b;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f153645a = iArr2;
            int[] iArr3 = new int[UniversalWidgetSectionModel.ImageWithTextType.values().length];
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                UniversalWidgetSectionModel.ImageWithTextType imageWithTextType = UniversalWidgetSectionModel.ImageWithTextType.f153599b;
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                UniversalWidgetSectionModel.ImageWithTextType imageWithTextType2 = UniversalWidgetSectionModel.ImageWithTextType.f153599b;
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                UniversalWidgetSectionModel.ImageWithTextType imageWithTextType3 = UniversalWidgetSectionModel.ImageWithTextType.f153599b;
                iArr3[3] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                UniversalWidgetSectionModel.ImageWithTextType imageWithTextType4 = UniversalWidgetSectionModel.ImageWithTextType.f153599b;
                iArr3[4] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            int[] iArr4 = new int[UniversalWidgetSectionModel.ImageWithTextImageRatio.values().length];
            try {
                iArr4[0] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                UniversalWidgetSectionModel.ImageWithTextImageRatio imageWithTextImageRatio = UniversalWidgetSectionModel.ImageWithTextImageRatio.f153584b;
                iArr4[1] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                UniversalWidgetSectionModel.ImageWithTextImageRatio imageWithTextImageRatio2 = UniversalWidgetSectionModel.ImageWithTextImageRatio.f153584b;
                iArr4[2] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                UniversalWidgetSectionModel.ImageWithTextImageRatio imageWithTextImageRatio3 = UniversalWidgetSectionModel.ImageWithTextImageRatio.f153584b;
                iArr4[3] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            int[] iArr5 = new int[UniversalWidgetBlockView.LayoutState.TextPosition.values().length];
            try {
                iArr5[0] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                UniversalWidgetBlockView.LayoutState.TextPosition textPosition = UniversalWidgetBlockView.LayoutState.TextPosition.f153496b;
                iArr5[1] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            int[] iArr6 = new int[UniversalWidgetSectionModel.TextColor.values().length];
            try {
                iArr6[0] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                UniversalWidgetSectionModel.TextColor textColor = UniversalWidgetSectionModel.TextColor.f153615b;
                iArr6[1] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr7 = new int[UniversalWidgetSectionModel.TextPosition.values().length];
            try {
                iArr7[0] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                UniversalWidgetSectionModel.TextPosition textPosition2 = UniversalWidgetSectionModel.TextPosition.f153619b;
                iArr7[1] = 2;
            } catch (NoSuchFieldError unused20) {
            }
        }
    }

    @Inject
    public b(boolean z12, boolean z13, int i12, boolean z14, @k c cVar) {
        this.f153640a = z12;
        this.f153641b = z13;
        this.f153642c = i12;
        this.f153643d = z14;
        this.f153644e = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x040a  */
    @Override // com.avito.android.extended_profile_ui_components.universal_widget.a
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetBlockView.UniversalWidgetBlockState a(@Y61.k com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel.Section r34, @Y61.k com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel.Block r35) {
        /*
            Method dump skipped, instructions count: 1122
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.extended_profile_ui_components.universal_widget.b.a(com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel$Section, com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel$Block):com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetBlockView$UniversalWidgetBlockState");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    @Override // com.avito.android.extended_profile_ui_components.universal_widget.a
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetFourBlocksView.UniversalWidgetFourBlocksState b(@Y61.k com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel.Section r8) {
        /*
            r7 = this;
            java.util.List r0 = r8.c()
            int r0 = r0.size()
            r1 = 4
            if (r0 != r1) goto L68
            boolean r0 = r8 instanceof com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel.ImageWithTextSection
            if (r0 == 0) goto L20
            r0 = r8
            com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel$ImageWithTextSection r0 = (com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel.ImageWithTextSection) r0
            com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel$TextPosition r2 = com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel.TextPosition.f153620c
            com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel$TextPosition r0 = r0.f153592e
            if (r0 != r2) goto L20
            r0 = 24
            int r0 = com.avito.android.util.y6.b(r0)
        L1e:
            r6 = r0
            goto L25
        L20:
            int r0 = com.avito.android.util.y6.b(r1)
            goto L1e
        L25:
            com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetFourBlocksView$UniversalWidgetFourBlocksState r0 = new com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetFourBlocksView$UniversalWidgetFourBlocksState
            java.util.List r1 = r8.c()
            r2 = 0
            java.lang.Object r1 = r1.get(r2)
            com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel$Block r1 = (com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel.Block) r1
            com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetBlockView$UniversalWidgetBlockState r2 = r7.a(r8, r1)
            java.util.List r1 = r8.c()
            r3 = 1
            java.lang.Object r1 = r1.get(r3)
            com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel$Block r1 = (com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel.Block) r1
            com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetBlockView$UniversalWidgetBlockState r3 = r7.a(r8, r1)
            java.util.List r1 = r8.c()
            r4 = 2
            java.lang.Object r1 = r1.get(r4)
            com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel$Block r1 = (com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel.Block) r1
            com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetBlockView$UniversalWidgetBlockState r4 = r7.a(r8, r1)
            java.util.List r1 = r8.c()
            r5 = 3
            java.lang.Object r1 = r1.get(r5)
            com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel$Block r1 = (com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel.Block) r1
            com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetBlockView$UniversalWidgetBlockState r5 = r7.a(r8, r1)
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            return r0
        L68:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Failed requirement."
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.extended_profile_ui_components.universal_widget.b.b(com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel$Section):com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetFourBlocksView$UniversalWidgetFourBlocksState");
    }

    public /* synthetic */ b(boolean z12, boolean z13, int i12, boolean z14, c cVar, int i13, C42822w c42822w) {
        this(z12, z13, i12, z14, (i13 & 16) != 0 ? new a() : cVar);
    }
}
