package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.exo.metadata.id3.CommentFrame;
import com.yandex.mobile.ads.exo.metadata.id3.InternalFrame;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes8.dex */
public final class oy {

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f388665c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a, reason: collision with root package name */
    public int f388666a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f388667b = -1;

    public final void a(Metadata metadata) {
        for (int i12 = 0; i12 < metadata.c(); i12++) {
            Metadata.Entry entryA = metadata.a(i12);
            if (entryA instanceof CommentFrame) {
                CommentFrame commentFrame = (CommentFrame) entryA;
                if ("iTunSMPB".equals(commentFrame.f382996c)) {
                    Matcher matcher = f388665c.matcher(commentFrame.f382997d);
                    if (matcher.find()) {
                        try {
                            String strGroup = matcher.group(1);
                            int i13 = pc1.f388768a;
                            int i14 = Integer.parseInt(strGroup, 16);
                            int i15 = Integer.parseInt(matcher.group(2), 16);
                            if (i14 > 0 || i15 > 0) {
                                this.f388666a = i14;
                                this.f388667b = i15;
                                return;
                            }
                        } catch (NumberFormatException unused) {
                            continue;
                        }
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            } else if (entryA instanceof InternalFrame) {
                InternalFrame internalFrame = (InternalFrame) entryA;
                if ("com.apple.iTunes".equals(internalFrame.f383003b) && "iTunSMPB".equals(internalFrame.f383004c)) {
                    Matcher matcher2 = f388665c.matcher(internalFrame.f383005d);
                    if (matcher2.find()) {
                        String strGroup2 = matcher2.group(1);
                        int i16 = pc1.f388768a;
                        int i17 = Integer.parseInt(strGroup2, 16);
                        int i18 = Integer.parseInt(matcher2.group(2), 16);
                        if (i17 > 0 || i18 > 0) {
                            this.f388666a = i17;
                            this.f388667b = i18;
                            return;
                        }
                    } else {
                        continue;
                    }
                }
            } else {
                continue;
            }
        }
    }
}
