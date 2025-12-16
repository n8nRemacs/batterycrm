package androidx.media3.extractor;

import androidx.media3.common.Metadata;
import androidx.media3.extractor.metadata.id3.CommentFrame;
import androidx.media3.extractor.metadata.id3.InternalFrame;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: GaplessInfoHolder.java */
@androidx.media3.common.util.J
/* loaded from: classes.dex */
public final class z {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f51906c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a, reason: collision with root package name */
    public int f51907a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f51908b = -1;

    public final boolean a(String str) throws NumberFormatException {
        Matcher matcher = f51906c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            int i12 = androidx.media3.common.util.M.f47887a;
            int i13 = Integer.parseInt(strGroup, 16);
            int i14 = Integer.parseInt(matcher.group(2), 16);
            if (i13 <= 0 && i14 <= 0) {
                return false;
            }
            this.f51907a = i13;
            this.f51908b = i14;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final void b(Metadata metadata) {
        int i12 = 0;
        while (true) {
            Metadata.Entry[] entryArr = metadata.f47361b;
            if (i12 >= entryArr.length) {
                return;
            }
            Metadata.Entry entry = entryArr[i12];
            if (entry instanceof CommentFrame) {
                CommentFrame commentFrame = (CommentFrame) entry;
                if ("iTunSMPB".equals(commentFrame.f50673d) && a(commentFrame.f50674e)) {
                    return;
                }
            } else if (entry instanceof InternalFrame) {
                InternalFrame internalFrame = (InternalFrame) entry;
                if ("com.apple.iTunes".equals(internalFrame.f50680c) && "iTunSMPB".equals(internalFrame.f50681d) && a(internalFrame.f50682e)) {
                    return;
                }
            } else {
                continue;
            }
            i12++;
        }
    }
}
