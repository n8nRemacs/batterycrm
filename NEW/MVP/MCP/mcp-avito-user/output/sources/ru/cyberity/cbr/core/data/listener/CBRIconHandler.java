package ru.cyberity.cbr.core.data.listener;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import ru.cyberity.cbr.core.PublicApi;

/* compiled from: CBRIconHandler.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0002\b\tJ\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lru/cyberity/cbr/core/data/listener/CBRIconHandler;", "", "onResolveIcon", "Landroid/graphics/drawable/Drawable;", "context", "Landroid/content/Context;", "key", "", "CBRCommonIcons", "CBRResultIcons", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@PublicApi
/* loaded from: classes9.dex */
public interface CBRIconHandler {

    /* compiled from: CBRIconHandler.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b(\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*¨\u0006+"}, d2 = {"Lru/cyberity/cbr/core/data/listener/CBRIconHandler$CBRCommonIcons;", "", "imageName", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getImageName", "()Ljava/lang/String;", "CLOSE", "DISCLOSURE", "TORCH_ON", "TORCH_OFF", "GALLERY", "WARNING", "NOTIFY", "MAIL", "NFC", "MRTD_PASSPORT", "MRTD_IDCARD", "MRTD_PHONE", "BACK", "BIN", "CALENDAR", "ATTACHMENT", "IMAGE", "SEARCH", "WARNING_OUTLINE", "TAKE_PHOTO", "LOCATION_ON", "LOCATION_OFF", "COUNTRY_OTHER", "PICTURE_AGREEMENT", "ICON_ID", "ICON_HOME", "ICON_PERSONS", "ICON_LIGHT", "ICON_CAMERA", "ICON_WIFI", "ROTATE_CW", "ROTATE_CCW", "FLIP", "SUCCESS_CHECK", "DELETE", "MORE", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum CBRCommonIcons {
        CLOSE("iconClose"),
        DISCLOSURE("iconDisclosure"),
        TORCH_ON("iconTorchOn"),
        TORCH_OFF("iconTorchOff"),
        GALLERY("iconGallery"),
        WARNING("iconWarning"),
        NOTIFY("iconNotify"),
        MAIL("iconMail"),
        NFC("iconNFC"),
        MRTD_PASSPORT("iconMRTDPassport"),
        MRTD_IDCARD("iconMRTDIDCard"),
        MRTD_PHONE("iconMRTDPhone"),
        BACK("iconBack"),
        BIN("iconBin"),
        CALENDAR("iconCalendar"),
        ATTACHMENT("iconAttachment"),
        IMAGE("iconImage"),
        SEARCH("iconSearch"),
        WARNING_OUTLINE("pictureWarningOutline"),
        TAKE_PHOTO("iconTakePhoto"),
        LOCATION_ON("pictureGeolocationOn"),
        LOCATION_OFF("pictureGeolocationOff"),
        COUNTRY_OTHER("iconOtherCountry"),
        PICTURE_AGREEMENT("pictureAgreement"),
        ICON_ID("iconID"),
        ICON_HOME("iconHouse"),
        ICON_PERSONS("iconPersons"),
        ICON_LIGHT("iconLight"),
        ICON_CAMERA("iconCamera"),
        ICON_WIFI("iconWifi"),
        ROTATE_CW("iconRotateCW"),
        ROTATE_CCW("iconRotateCCW"),
        FLIP("pictureDocumentFlip"),
        SUCCESS_CHECK("iconSuccess"),
        DELETE("iconDelete"),
        MORE("iconMore");


        @k
        private final String imageName;

        CBRCommonIcons(String str) {
            this.imageName = str;
        }

        @k
        public final String getImageName() {
            return this.imageName;
        }
    }

    /* compiled from: CBRIconHandler.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/cyberity/cbr/core/data/listener/CBRIconHandler$CBRResultIcons;", "", "imageName", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getImageName", "()Ljava/lang/String;", "SUCCESS", "FAILURE", "SUBMITTED", "WARNING", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum CBRResultIcons {
        SUCCESS("pictureSuccess"),
        FAILURE("pictureFailure"),
        SUBMITTED("pictureSubmitted"),
        WARNING("pictureWarning");


        @k
        private final String imageName;

        CBRResultIcons(String str) {
            this.imageName = str;
        }

        @k
        public final String getImageName() {
            return this.imageName;
        }
    }

    @l
    Drawable onResolveIcon(@k Context context, @k String key);
}
