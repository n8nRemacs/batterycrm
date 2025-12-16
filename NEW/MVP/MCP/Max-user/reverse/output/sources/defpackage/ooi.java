package defpackage;

import java.io.IOException;
import java.io.Writer;
import org.apache.http.HttpStatus;

/* loaded from: classes.dex */
public abstract class ooi {
    public static final qt5[] a = {new qt5("name_ulr_private", 1), new qt5("name_sleep_segment_request", 1), new qt5("get_last_activity_feature_id", 1), new qt5("support_context_feature_id", 1), new qt5("get_current_location", 2), new qt5("get_last_location_with_request", 1), new qt5("set_mock_mode_with_callback", 1), new qt5("set_mock_location_with_callback", 1), new qt5("inject_location_with_callback", 1), new qt5("location_updates_with_callback", 1), new qt5("use_safe_parcelable_in_intents", 1), new qt5("flp_debug_updates", 1), new qt5("google_location_accuracy_enabled", 1), new qt5("geofences_with_callback", 1), new qt5("location_enabled", 1)};

    public static final String a(String str) {
        return b(str) ? vmf.M(str, "mailto:") : c(str) ? vmf.M(str, "tel:") : str;
    }

    public static final boolean b(String str) {
        return dnf.r(str, "mailto:", false);
    }

    public static final boolean c(String str) {
        return dnf.r(str, "tel:", false);
    }

    public static void d(Writer writer, String str) throws IOException {
        writer.write(34);
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt == '\\' || cCharAt == '\"' || cCharAt <= 31) {
                if (i2 > i) {
                    writer.write(str, i, i2 - i);
                }
                writer.write(92);
                if (cCharAt == '\f') {
                    writer.write(HttpStatus.SC_PROCESSING);
                } else if (cCharAt == '\r') {
                    writer.write(114);
                } else if (cCharAt != '\"' && cCharAt != '/' && cCharAt != '\\') {
                    switch (cCharAt) {
                        case '\b':
                            writer.write(98);
                            break;
                        case '\t':
                            writer.write(116);
                            break;
                        case '\n':
                            writer.write(110);
                            break;
                        default:
                            writer.write(117);
                            writer.write(zdi.b((cCharAt >> '\f') & 15));
                            writer.write(zdi.b((cCharAt >> '\b') & 15));
                            writer.write(zdi.b((cCharAt >> 4) & 15));
                            writer.write(zdi.b(cCharAt & 15));
                            break;
                    }
                } else {
                    writer.write(cCharAt);
                }
                i = i2 + 1;
            }
        }
        if (length > i) {
            writer.write(str, i, length - i);
        }
        writer.write(34);
    }
}
