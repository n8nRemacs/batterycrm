package ru.cyberity.cbr.camera.photo.presentation.document;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import ru.cyberity.cbr.camera.photo.presentation.document.CBRFrameViewWithBackground;
import ru.cyberity.cbr.camera.photo.presentation.document.CBRPhotoDocumentPickerViewModel;

/* compiled from: CBRPhotoDocumentPickerFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lru/cyberity/cbr/camera/photo/presentation/document/CBRPhotoDocumentPickerViewModel$AutoCaptureHint$State;", "Lru/cyberity/cbr/camera/photo/presentation/document/CBRFrameViewWithBackground$State;", "b", "(Lru/cyberity/cbr/camera/photo/presentation/document/CBRPhotoDocumentPickerViewModel$AutoCaptureHint$State;)Lru/cyberity/cbr/camera/photo/presentation/document/CBRFrameViewWithBackground$State;", "frameState", "cyberity-mobile-sdk-internal_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class c {

    /* compiled from: CBRPhotoDocumentPickerFragment.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f432408a;

        static {
            int[] iArr = new int[CBRPhotoDocumentPickerViewModel.AutoCaptureHint.State.values().length];
            iArr[CBRPhotoDocumentPickerViewModel.AutoCaptureHint.State.DEFAULT.ordinal()] = 1;
            iArr[CBRPhotoDocumentPickerViewModel.AutoCaptureHint.State.INVALID.ordinal()] = 2;
            iArr[CBRPhotoDocumentPickerViewModel.AutoCaptureHint.State.INTERMEDIATE.ordinal()] = 3;
            iArr[CBRPhotoDocumentPickerViewModel.AutoCaptureHint.State.OK.ordinal()] = 4;
            f432408a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CBRFrameViewWithBackground.State b(CBRPhotoDocumentPickerViewModel.AutoCaptureHint.State state) {
        int i12 = a.f432408a[state.ordinal()];
        if (i12 == 1) {
            return CBRFrameViewWithBackground.State.DEFAULT;
        }
        if (i12 == 2) {
            return CBRFrameViewWithBackground.State.RED;
        }
        if (i12 == 3) {
            return CBRFrameViewWithBackground.State.YELLOW;
        }
        if (i12 == 4) {
            return CBRFrameViewWithBackground.State.GREEN;
        }
        throw new NoWhenBranchMatchedException();
    }
}
