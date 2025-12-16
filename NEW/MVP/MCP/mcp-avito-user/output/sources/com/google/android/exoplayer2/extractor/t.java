package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.InternalFrame;
import com.google.android.exoplayer2.util.U;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: GaplessInfoHolder.java */
/* loaded from: classes6.dex */
public final class t {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f344990c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a, reason: collision with root package name */
    public int f344991a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f344992b = -1;

    public final boolean a(String str) throws NumberFormatException {
        Matcher matcher = f344990c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            int i12 = U.f348106a;
            int i13 = Integer.parseInt(strGroup, 16);
            int i14 = Integer.parseInt(matcher.group(2), 16);
            if (i13 <= 0 && i14 <= 0) {
                return false;
            }
            this.f344991a = i13;
            this.f344992b = i14;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final void b(Metadata metadata) {
        int i12 = 0;
        while (true) {
            Metadata.Entry[] entryArr = metadata.f345623b;
            if (i12 >= entryArr.length) {
                return;
            }
            Metadata.Entry entry = entryArr[i12];
            if (entry instanceof CommentFrame) {
                CommentFrame commentFrame = (CommentFrame) entry;
                if ("iTunSMPB".equals(commentFrame.f345687d) && a(commentFrame.f345688e)) {
                    return;
                }
            } else if (entry instanceof InternalFrame) {
                InternalFrame internalFrame = (InternalFrame) entry;
                if ("com.apple.iTunes".equals(internalFrame.f345694c) && "iTunSMPB".equals(internalFrame.f345695d) && a(internalFrame.f345696e)) {
                    return;
                }
            } else {
                continue;
            }
            i12++;
        }
    }
}
