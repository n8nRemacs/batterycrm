package com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators;

import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35949t5;
import com.avito.user_stats.model.extended_user_stats.UserMessage;
import com.avito.user_stats.model.extended_user_stats.UserMessageAction;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BasicIndicatorsTabView.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_user-stats_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class h {
    public static final void a(@Y61.l UserMessage userMessage, @Y61.k View view, @Y61.k com.avito.android.util.text.a aVar, @Y61.l Y41.l<? super RJ0.a, G0> lVar, @Y61.l com.jakewharton.rxrelay3.c<DeepLink> cVar) {
        String text;
        UserMessageAction action;
        DeepLink link;
        UserMessageAction action2;
        AttributedText title;
        UniversalImage image;
        Image imageDependsOnTheme;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) view.findViewById(R.id.sdv_stats_error);
        TextView textView = (TextView) view.findViewById(R.id.tv_title_stats_error);
        TextView textView2 = (TextView) view.findViewById(R.id.tv_subtitle_stats_error);
        Button button = (Button) view.findViewById(R.id.bnt_stats_error);
        simpleDraweeView.setVisibility((userMessage != null ? userMessage.getImage() : null) != null ? 0 : 8);
        textView.setVisibility((userMessage != null ? userMessage.getTitle() : null) != null ? 0 : 8);
        textView2.setVisibility((userMessage != null ? userMessage.getDescription() : null) != null ? 0 : 8);
        button.setVisibility((userMessage != null ? userMessage.getAction() : null) == null ? 8 : 0);
        textView.setText(aVar.c(view.getContext(), userMessage != null ? userMessage.getTitle() : null));
        textView2.setText(aVar.c(view.getContext(), userMessage != null ? userMessage.getDescription() : null));
        C35949t5.c(simpleDraweeView, (userMessage == null || (image = userMessage.getImage()) == null || (imageDependsOnTheme = UniversalImageKt.getImageDependsOnTheme(image, com.avito.android.lib.util.darkTheme.c.b(simpleDraweeView.getContext()))) == null) ? null : com.avito.android.image_loader.b.b(imageDependsOnTheme), null, null, null, 14);
        if (userMessage == null || (action2 = userMessage.getAction()) == null || (title = action2.getTitle()) == null || (text = title.getText()) == null) {
            text = "";
        }
        button.setText(text);
        if (userMessage == null || (action = userMessage.getAction()) == null || (link = action.getLink()) == null) {
            return;
        }
        button.setOnClickListener(new com.avito.android.job.cv_info_actualization.ui.items.radio.g(lVar, link, cVar));
    }
}
